package com.ftl.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.Semaphore;

import javax.xml.parsers.ParserConfigurationException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.apache.commons.lang.ClassUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.format.DateTimeFormat;
import org.xml.sax.SAXException;

import com.ftl.derived.FetalLexer;
import com.ftl.derived.FetalParser;
import com.ftl.derived.FetalParser.BlockContext;
import com.ftl.derived.FetalParser.TransactionContext;
import com.ftl.events.Step;

public abstract class FetalTransaction {
	private static Logger logger = Logger.getLogger(FetalTransaction.class);

	private String Description = "";
	private Map<String, Variable> variables = new HashMap<String, Variable>();
	private Map<String, String> accountNames = new HashMap<String, String>();
	private Properties props;
	private String fileName = "";
	private String errMsg = "";
	private long errorCount = 0;
	private boolean hasErrors = false;
	private boolean debugMode = false;
	private TransactionContext transCtx;
	private BlockContext blockCtx;
	private FetalParser fParser;
	private Semaphore semaphore = null;
	private int lineNum;
	private int prevLine;
	private Step step;

	public Semaphore getSemaphore() {
		return semaphore;
	}

	public void setSemaphore(Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	public TransactionContext getTransCtx() {
		return transCtx;
	}

	public void setTransCtx(TransactionContext transCtx) {
		this.transCtx = transCtx;
	}

	public BlockContext getBlockCtx() {
		return blockCtx;
	}

	public FetalParser getfParser() {
		return fParser;
	}

	public void setfParser(FetalParser fParser) {
		this.fParser = fParser;
	}

	public int getLineNum() {
		return lineNum;
	}

	public void setLineNum(int lineNum) {
		this.lineNum = lineNum;
	}

	public int getPrevLine() {
		return prevLine;
	}

	public void setPrevLine(int prevLine) {
		this.prevLine = prevLine;
	}

	public Step getStep() {
		return step;
	}

	public void setStep(Step step) {
		this.step = step;
	}

	/***********************************************************************
	 * Error Handliing
	 * 
	 ***********************************************************************/

	final String[] errorCode = { "Variable Not Defined", "Malformed Expression", "Type cast exception", "Cannot load file", 
			"Invalid date format", "Cannot load object", "Cannot invoke method", "Invalid object",
			"Invalid argument", "Record not found", "Debug error", "Malformed Code Block", 
			"Invalid map location", "Invalid properties file", "Invalid map", "Can't load map file", 
			"No Such Method", "Security Violation", "Illegal Access", "Illegal Argument", 
			"Invocation Target Exception", "Class Not Found", "Can Not Instantiate Object", "Illegal Argument Exceptiion", 
			"Divide By Zero", "Null Object", "Invalid Operator"};

	@SuppressWarnings("unused")
	private static final int NOT_DEFINED = 0, MALFORMED_EXP = 1, CAST_EXCEPT = 2, CANNOT_LOAD_FILE = 3,
			INVALID_DATE = 4, CANNOT_LOAD_OBJECT = 5, CANNOT_INVOKE_METHD = 6, INVALID_OBJECT = 7, 
			INVALID_ARG = 8, RECORD_NOT_FOUND = 9, DEBUG_ERROR = 10, MALFORMED_CODEBLOCK = 11, 
			INVALID_MAP_LOC = 12, INVALID_PROP_FILE = 13, INVALID_MAP = 14, CANNOT_LOAD_MAP_FILE = 15, 
			NO_SUCH_METHOD = 16, SECURITY_VIOLATION = 17, ILLEGAL_ACCESS = 18, ILLEGAL_ARGUMENT = 19, 
			INVOCATION_TARGET_EXCEPTION = 20, CLASS_NOT_FOUND = 21, CAN_NOT_INSTANTIATE = 22, ILLEGAL_ARGUMENT_EXCEPTION = 23,
			DIVIDE_BY_ZERO=24, NULL_OBJECT=25, INVALID_OPERATOR=26;

	public void registerError(int errNum) {
		errorCount++;
		errMsg = errorCode[errNum];
	}

	public String getErrMsg() {
		String msg = errMsg;

		return msg;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public RecognitionException errorHandler(ParserRuleContext context, FetalParser parser) {
		if (errorCount <= 0) {
			return null;
		}
		Token token = parser.getCurrentToken();
		String errStr = String.format(" File: %s @line %d, pos %d", getFileName(), token.getLine(),
				token.getCharPositionInLine());
		String msg = getErrMsg();
		msg += errStr;
		setErrMsg(msg);
		parser.notifyErrorListeners(msg);
		errorCount = 0;
		hasErrors = true;

		return new RecognitionException(msg, parser, null, context);
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public boolean isDebugMode() {
		return debugMode;
	}

	public void setDebugMode(boolean debugMode) {
		this.debugMode = debugMode;
	}

	public boolean hasErrors() {
		return hasErrors;
	}

	public boolean checkError(Long errorCount) {
		return (errorCount <= this.errorCount) ? false : true;
	}

	/*********************************************************************
	 * Initialize Transaction This clears all variables and the internal sales
	 * receipt
	 *********************************************************************/
	public void initTransaction(String setupUrl, Semaphore sem) throws IOException {
		URL url = new URL(setupUrl);
		InputStream in = url.openStream();
		Reader reader = new InputStreamReader(in);
		props = new Properties();
		props.load(reader);
		semaphore = sem;
		if (sem != null) {
			step = new Step();
		}
		hasErrors = false;
		errorCount = 0;
		errMsg = "";
	}

	public void initTransaction(String setupUrl) throws IOException {
		initTransaction(setupUrl, null);
	}

	public void closeFetal() {
		clearVariables();
		clearMap();
		errMsg = "";
		errorCount = 0;
	}

	public void clearVariables() {
		variables.clear();
	}

	public void clearMap() {
		accountNames.clear();
	}

	/*********************************************************************
	 * Setters and Getters
	 *********************************************************************/
	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public long getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(long errorCount) {
		this.errorCount = errorCount;
	}

	public Properties getProps() {
		return props;
	}

	public void putMap(String account, String name) {
		accountNames.put(account, name);
	}

	public String getMap(String name) {
		String accountNum = accountNames.get(name);
		if (accountNum == null) {
			accountNum = name;
		}

		return accountNum;
	}

	/****************************************************************
	 * Mapfile maps account names to account number
	 ****************************************************************/
	public void mapFile(String fileName) {
		List<String> namePairs;
		try {
			namePairs = new MapFile(props.getProperty("mapPath"), fileName).getMapList();
		} catch (MalformedURLException e) {
			registerError(INVALID_MAP_LOC);
			return;
		} catch (ParserConfigurationException e) {
			registerError(INVALID_PROP_FILE);
			return;
		} catch (SAXException e) {
			registerError(INVALID_MAP);
			return;
		} catch (IOException e) {
			registerError(CANNOT_LOAD_MAP_FILE);
			return;
		}

		for (String nameValue : namePairs) {
			String[] nv = nameValue.split(";");
			putMap(nv[0], nv[1]);
		}
	}

	/************************************************************************
	 * For processing variables
	 ************************************************************************/

	public void assignVariable(String name, Object obj) {
		if (obj == null) {
			
		}
		
		Variable var = variables.get(name);
		if (var != null) {
			var.setValue(obj);
			variables.replace(name, var);
		}
	}

	public void publish(String name, VariableType type, Object value) {
		Variable var = new Variable();

		var.setType(type);
		var.setValue(value);
		var.setName(name);

		variables.put(name, var);
	}

	public void publish(String name, VariableType type) {
		Variable var = new Variable();

		var.setType(type);
		var.setName(name);

		variables.put(name, var);
	}

	public VariableType getType(String name) {
		return variables.get(name).getType();
	}

	public Object getValue(String name) {
		Variable var = variables.get(name);

		if (var != null) {
			if (var.getType() == VariableType.DECIMAL) {
				if (var.getValue() != null) {
					return Double.valueOf(String.valueOf(var.getValue()));
				} else {
					return Double.valueOf(0);
				}
			} else if (var.getType() == VariableType.NUMBER) {
				if (var.getValue() != null) {
					return Long.valueOf(String.valueOf(var.getValue()));
				} else {
					return Long.valueOf(0);
				}
			} else if (var.getType() == VariableType.BOOLEAN) {
				if (var.equals(null)) {
					return ((Boolean) var.getValue()).booleanValue();
				} else {
					return false;
				}
			} else if (var.getType() == VariableType.STRING) {
				if (var.getValue() != null) {
					return String.valueOf(var.getValue());
				} else {
					return "";
				}
			} else if (var.getType() == VariableType.DATE) {
				return (Date) var.getValue();
			} else {
				return var.getValue();
			}
		}

		return null;
	}

	public List<Variable> getVarList() {
		List<Variable> varList = new ArrayList<Variable>();

		for (Entry<String, Variable> entry : variables.entrySet()) {
			varList.add(entry.getValue());
		}

		return varList;
	}

	public String stripQuotes(String in) {
		return in.substring(1, in.length() - 1);
	}

	public boolean isVariable(String name) {
		return (variables.get(name) != null);
	}

	public Long getLong(String num) {
		return Long.valueOf(num);
	}

	public Double getDouble(String num) {
		return Double.valueOf(num);
	}

	public String getString(String string) {
		return string;
	}

	public String getVariableType(String name) {
		Object obj = getValue(name);

		return obj.getClass().getSimpleName();
	}

	public Object importClass(String classPath) {
		Class<?> cls;
		Object obj = null;

		try {
			cls = Class.forName(classPath);
			obj = cls.newInstance();
			cls.cast(obj);
		} catch (ClassNotFoundException e) {
			registerError(CLASS_NOT_FOUND);

			return null;
		} catch (InstantiationException e) {
			registerError(CAN_NOT_INSTANTIATE);

			return null;
		} catch (IllegalAccessException e) {
			registerError(ILLEGAL_ARGUMENT_EXCEPTION);

			return null;
		}

		return obj;
	}

	public Set<?> getList(Object obj, String method) {
		Set<?> result = null;

		Method m;
		try {
			m = obj.getClass().getMethod(method, null);
			result = (Set<?>) m.invoke(obj, null);
		} catch (NoSuchMethodException e) {
			registerError(NO_SUCH_METHOD);

			return null;
		} catch (SecurityException e) {
			registerError(SECURITY_VIOLATION);

			return null;
		} catch (IllegalAccessException e) {
			registerError(ILLEGAL_ACCESS);

			return null;
		} catch (IllegalArgumentException e) {
			registerError(ILLEGAL_ARGUMENT);

			return null;
		} catch (InvocationTargetException e) {
			registerError(INVOCATION_TARGET_EXCEPTION);

			return null;
		}

		return result;
	}

	public Object invokeMethod(Object obj, String method, Object... args) {
		Object o = null;
		Class<?>[] cls = null;
		Method m;
		if (args != null && args.length > 0) {
			cls = new Class<?>[args.length];
			for (int i = 0; i < args.length; i++) {
				cls[i] = args[i].getClass();
			}
		} else {
			args = null;
		}

		try {
			if (args != null) {
				m = searchForMethod(obj.getClass(), method, args);
				if (m == null)
					throw new NoSuchMethodException("Error: '" + obj.getClass().getName() + "." + method + "()"
							+ "' does not exist or it as a wrong argument signature.");
				o = m.invoke(obj, args);
			} else {
				m = obj.getClass().getMethod(method, null);
				o = m.invoke(obj, null);
			}

		} catch (NoSuchMethodException e) {
			registerError(NO_SUCH_METHOD);

			return null;
		} catch (SecurityException e) {
			registerError(SECURITY_VIOLATION);

			return null;
		} catch (IllegalAccessException e) {
			registerError(ILLEGAL_ACCESS);

			return null;
		} catch (IllegalArgumentException e) {
			registerError(ILLEGAL_ARGUMENT);

			return null;
		} catch (InvocationTargetException e) {
			registerError(INVOCATION_TARGET_EXCEPTION);

			return null;
		}

		return o;
	}

	private Method searchForMethod(Class<?> clss, String name, Object... parms) {
		Method[] methods = clss.getMethods();
		for (int i = 0; i < methods.length; i++) {
			// Has to be named the same of course.
			if (!methods[i].getName().equals(name))
				continue;

			Class<?>[] types = methods[i].getParameterTypes();

			// Does it have the same number of arguments that we're looking for.
			if (types.length != parms.length)
				continue;

			// Check for type compatibility
			if (areTypesCompatible(types, parms))
				return methods[i];
		}
		return null;
	}

	private boolean areTypesCompatible(Class<?>[] types, Object[] parms) {
		boolean result = true;

		if (parms != null) {
			for (int i = 0; i < types.length; i++) {
				if (ClassUtils.isAssignable(types[i], parms[i].getClass()) == false) {
					types[i] = autoBox(types[i]);
					if (ClassUtils.isAssignable(types[i], parms[i].getClass()) == false) {
						result = false;
						break;
					}
				}
			}
		}

		return result;
	}

	private Class<?> autoBox(Class<?> cls) {
		Class<?> result = null;
		if (cls == double.class) {
			result = java.lang.Double.class;
		}
		if (cls == long.class) {
			result = java.lang.Long.class;
		}
		if (cls == boolean.class) {
			result = java.lang.Boolean.class;
		}
		if (cls == byte.class) {
			result = java.lang.Byte.class;
		}

		if (cls == char.class) {
			result = java.lang.Character.class;
		}

		if (cls == float.class) {
			result = java.lang.Float.class;
		}

		if (cls == int.class) {
			result = java.lang.Integer.class;
		}

		if (cls == short.class) {
			result = java.lang.Short.class;
		}

		return result;
	}

	/***********************************************************************
	 * Date functions
	 ***********************************************************************/
	public Date truncateTime(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		return cal.getTime();
	}

	public Double getDays(Date date, Date date2) {
		String pattern = "yyyy-MM-dd:HH:mm";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);

		DateTime dt1 = DateTime.parse(sd.format(date), DateTimeFormat.forPattern(pattern));
		DateTime dt2 = DateTime.parse(sd.format(date2), DateTimeFormat.forPattern(pattern));

		Hours hours = Hours.hoursBetween(dt1, dt2);

		Integer diff = hours.getHours();
		BigDecimal bd = new BigDecimal(Double.toString(diff.doubleValue() / 24.0));

		return bd.setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

	public Double getHours(Date start, Date end) {
		String pattern = "yyyy-MM-dd:HH:mm";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);

		DateTime dt1 = DateTime.parse(sd.format(start), DateTimeFormat.forPattern(pattern));
		DateTime dt2 = DateTime.parse(sd.format(end), DateTimeFormat.forPattern(pattern));

		Hours hours = Hours.hoursBetween(dt1, dt2);

		Integer diff = hours.getHours();
		BigDecimal bd = new BigDecimal(Double.toString(diff.doubleValue()));

		return bd.setScale(2, RoundingMode.HALF_UP).doubleValue();

	}

	public Double getMinutes(Date start, Date end) {

		String pattern = "yyyy-MM-dd:HH:mm";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);

		DateTime dt1 = DateTime.parse(sd.format(start), DateTimeFormat.forPattern(pattern));
		DateTime dt2 = DateTime.parse(sd.format(end), DateTimeFormat.forPattern(pattern));

		Minutes minutes = Minutes.minutesBetween(dt1, dt2);

		Integer diff = minutes.getMinutes();

		BigDecimal bd = new BigDecimal(Double.toString(diff.doubleValue()));

		return bd.setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

	public String dayOfTheWeek(Date date) {
		final String[] dow = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		Calendar c = Calendar.getInstance();
		c.setTime(date);

		return dow[(c.get(Calendar.DAY_OF_WEEK) - 1)];
	}

	public Long getCalendarDay(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);

		return Long.valueOf(String.valueOf(c.get(Calendar.DAY_OF_MONTH)));
	}

	public Long getMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);

		return (Long.valueOf(String.valueOf(c.get(Calendar.MONTH))) + 1);
	}

	public Long getYear(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);

		return Long.valueOf(String.valueOf(c.get(Calendar.YEAR)));
	}

	public Date getDate(long year, long month, long day) {

		int y = (int) Integer.valueOf(String.valueOf(year));
		int m = (int) (Integer.valueOf(String.valueOf(month)) - 1);
		int d = (int) Integer.valueOf(String.valueOf(day));

		Calendar c = Calendar.getInstance();

		c.set(y, m, d, 0, 0, 0);

		return c.getTime();
	}

	protected String translateFormat(String format) {
		StringBuilder sb = new StringBuilder(format);
		int ndx = 0;
		while ((ndx = sb.indexOf("{")) != -1) {
			if (sb.charAt(ndx + 1) == 'F') {
				sb.replace(ndx, ndx + 1, "'%t");
				sb.replace(ndx + 4, ndx + 5, "'");
			} else if (sb.charAt(ndx + 1) == 's') {
				sb.replace(ndx, ndx + 1, "'%");
				sb.replace(ndx + 3, ndx + 4, "'");
			} else {
				sb.replace(ndx, ndx + 1, "%");
				sb.deleteCharAt(ndx + 2);
			}
		}
		return sb.toString();
	}

	public double futureValue(double cash, double rate, long period) {

		return cash * ((1 + rate) * period);
	}

	public double presentValue(double cash, double rate, long period) {

		return cash / ((1 + rate) * period);
	}

	public Date nextDate(Date base, Date last, String schedule) {
		Date result = null;

		switch (schedule.toUpperCase()) {
		case "ANNUALLY":
			result = annually(last);
			break;
		case "BI-ANNUALLY":
			result = biAnnually(last);
			break;
		case "QUARTERLY":
			result = quarterly(last);
			break;
		case "MONTHLY":
			result = monthly(last);
			break;
		case "BI-MONTHLY":
			result = biMonthly(base, last);
			break;
		case "WEEKLY":
			result = weekly(last);
			break;
		case "DAILY":
			result = daily(last);
			break;
		}

		return result;
	}

	private Date daily(Date last) {
		LocalDate jLast = new LocalDate(last);

		return jLast.plusDays(1).toDate();
	}

	private Date weekly(Date last) {
		LocalDate jLast = new LocalDate(last);

		return jLast.plusWeeks(1).toDate();
	}

	private Date biMonthly(Date base, Date last) {
		LocalDate current = new LocalDate();
		LocalDate jBase = new LocalDate(base);
		LocalDate jLast = new LocalDate(last);
		int firstDay;
		int lastDay;

		if (jBase.getMonthOfYear() != 2) {
			if (jBase.getDayOfMonth() > 15) {
				lastDay = jBase.getDayOfMonth();
				firstDay = (lastDay - 15);
			} else {
				firstDay = jBase.getDayOfMonth();
				lastDay = firstDay + 15;
			}
		} else {
			if (jBase.getDayOfMonth() > 14) {
				lastDay = jBase.getDayOfMonth();
				firstDay = (lastDay - 14);
			} else {
				firstDay = jBase.getDayOfMonth();
				lastDay = firstDay + 14;
			}
		}

		if (jLast.getMonthOfYear() < current.getMonthOfYear()) {
			current = current.withDayOfMonth(firstDay);
		} else if (current.getDayOfMonth() < firstDay) {
			current = current.withDayOfMonth(firstDay);
		} else if (current.getDayOfMonth() > firstDay && current.getDayOfMonth() < lastDay) {
			current = current.withDayOfMonth(lastDay);
		} else if (current.getDayOfMonth() > lastDay) {
			current = current.plusMonths(1).withDayOfMonth(firstDay);
		}

		return current.toDate();
	}

	private Date monthly(Date last) {
		LocalDate jLast = new LocalDate(last);

		return jLast.plusMonths(1).toDate();
	}

	private Date quarterly(Date last) {
		String firstQtr = props.getProperty("firstQuarter");
		String secondQtr = props.getProperty("secondQuarter");
		String thirdQtr = props.getProperty("thirdQuarter");
		String fourthQtr = props.getProperty("fourthQuarter");

		int quarter = 0;
		DateFormat df = new SimpleDateFormat("MM-dd");
		String inpDate = df.format(last);

		if (inpDate.compareTo(firstQtr) >= 0 && inpDate.compareTo(secondQtr) < 0) {
			quarter = 1;
		} else if (inpDate.compareTo(secondQtr) >= 0 && inpDate.compareTo(thirdQtr) < 0) {
			quarter = 2;
		} else if (inpDate.compareTo(thirdQtr) >= 0 && inpDate.compareTo(fourthQtr) < 0) {
			quarter = 3;
		} else if (inpDate.compareTo(fourthQtr) >= 0) {
			quarter = 3;
		}
		quarter = (quarter % 4) + 1;

		String current = "";
		Calendar cal = Calendar.getInstance();
		switch (quarter) {
		case 1:
			current = firstQtr;
			break;
		case 2:
			current = secondQtr;
			break;
		case 3:
			current = thirdQtr;
			break;
		case 4:
			current = fourthQtr;
			break;
		}

		String[] mmdd = current.split("-");
		Integer month = Integer.valueOf(mmdd[0]);
		Integer day = Integer.valueOf(mmdd[1]);

		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);

		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		return cal.getTime();
	}

	private Date biAnnually(Date last) {
		LocalDate jLast = new LocalDate(last);

		return jLast.plusMonths(6).toDate();
	}

	private Date annually(Date last) {
		LocalDate jLast = new LocalDate(last);

		return jLast.plusYears(1).toDate();
	}

	/*******************************************************************************
	 * This is for debug only! It lists all declared variables and their values.
	 *******************************************************************************/

	public void printVarList() {
		System.out.println();
		System.out.println("*********************Defined Variables*********************");
		List<Variable> varList = getVarList();
		for (Variable var : varList) {
			System.out.printf("%s %s = %s\n", var.getType(), var.getName(), var.getValue());
		}
	}

	public boolean isMatched(Object lObj, Object rObj) {
		if (lObj == null || rObj == null)
			return true;
		if (lObj.getClass().getSimpleName().compareTo("String") == 0)
			return true;
		if (lObj.getClass().getSimpleName().compareTo("Date") == 0)
			return true;

		return (lObj.getClass().getName().compareTo(rObj.getClass().getName()) == 0);
	}

	/*******************************************************************************************
	 * Execute the fetal script
	 *******************************************************************************************/

	public void loadRule(String rule) throws IOException, RecognitionException, RuntimeException {
		URL url;

		if (rule.contains("//")) {
			url = new URL(rule);
		} else {
			url = new URL(props.getProperty("transactionUrl") + rule);
		}
		this.setFileName(rule);

		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));

		CodePointCharStream in = CharStreams.fromReader(read);
		FetalLexer lexer = new FetalLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		FetalParser parser = new FetalParser(tokens);
		fParser = parser;

		parser.removeErrorListeners(); // remove ConsoleErrorListener
		parser.addErrorListener(new FetalErrorListener()); // add ours
		try {
			transCtx = parser.transaction(this);

		} catch (RuntimeException e) {
			if (errMsg.length() == 0) {
				errMsg = e.toString();
				logger.error(errMsg);
			}
			throw new RuntimeException(errMsg);

		}
	}
	
	public void loadRule(File file) throws RecognitionException, IOException, RuntimeException {
		String url = file.toURI().toURL().getPath();
		url = "File://" + url;
		loadRule(url);
	}

	public double getBookValue(double cost, double salvage, double life, Double howOld, boolean isDouble) {

		double base = cost - salvage;
		double depExpense = base / life;
		// Is the doouble declining depreciation? If so, multiply it by 2 otherwise,
		// only by 1
		double rate = (depExpense / base) * ((isDouble) ? 2.0 : 1.0);
		double bookValue = 0;
		double depValue = cost;
		double oldDepValue = 0.0;
		double annualDep = 0.0;
		double oldAnnualDep = 0.0;
		double accum = 0.0;

		for (int i = 0; i < howOld.intValue(); i++) {
			depValue = depValue - annualDep;
			annualDep = depValue * rate;
			accum = accum + annualDep;
			bookValue = cost - accum;
			if (bookValue <= salvage) {
				bookValue = oldDepValue - oldAnnualDep;
				annualDep = bookValue - salvage;
				accum = (accum < base) ? accum : base;

				bookValue = (annualDep > salvage) ? bookValue : salvage;
			}
			oldDepValue = depValue;
			oldAnnualDep = annualDep;
		}

		return bookValue;
	}

	public void _credit(Double amount, String account) {
		account = getMap(account);
		credit(amount, account);
	}

	public void _debit(Double amount, String account) {
		account = getMap(account);
		debit(amount, account);
	}

	public void _ledger(char type, Double amount, String account, String description) {
		account = getMap(account);
		ledger(type, amount, account, description);
	}

	public double _getBalance(String account) {
		account = getMap(account);

		return getBalance(account);
	}

	public Object _lookup(String sql, Object... args) {
		sql = translateFormat(sql);

		return lookup(sql, args);
	}

	public void _update(String sql, Object... args) {
		sql = translateFormat(sql);
		int ndx = sql.toUpperCase().indexOf("LIMIT");
		int limit_num = 0;
		if (ndx != -1) {
			String limit = sql.substring(ndx);
			sql = sql.substring(0, ndx);
			StringTokenizer st = new StringTokenizer(limit);
			int i = 0;
			while (st.hasMoreTokens()) {
				String number = st.nextToken();
				if (i == 1) {
					limit_num = Integer.valueOf(number);
				}
				i++;
			}
		}
		update(sql, limit_num, args);
	}

	public Set<Object> _list(String sql, Object... args) {
		sql = translateFormat(sql);
		int ndx = sql.toUpperCase().indexOf("LIMIT");
		int limit_num = 0;
		if (ndx != -1) {
			String limit = sql.substring(ndx);
			sql = sql.substring(0, ndx);
			StringTokenizer st = new StringTokenizer(limit);
			int i = 0;
			while (st.hasMoreTokens()) {
				String number = st.nextToken();
				if (i == 1) {
					limit_num = Integer.valueOf(number);
				}
				i++;
			}
		}
		return list(sql, limit_num, args);
	}

	/***************************************************************************
	 * This was formerly in a class called ObjectMath. It was moved here to improve
	 * error reporting.
	 ***************************************************************************/

	public Double round(Double arg) {
		BigDecimal bd = new BigDecimal(arg);

		return bd.setScale(0, RoundingMode.HALF_UP).doubleValue();
	}

	public Double roundUp(Double arg) {
		BigDecimal bd = new BigDecimal(arg);

		return bd.setScale(0, RoundingMode.UP).doubleValue();
	}

	public Double roundDown(Double arg) {
		BigDecimal bd = new BigDecimal(arg);

		return bd.setScale(0, RoundingMode.DOWN).doubleValue();
	}

	public Double roundTo(Double arg, Long places) {
		BigDecimal bd = new BigDecimal(arg);

		return bd.setScale(Integer.valueOf(String.valueOf(places)), RoundingMode.HALF_UP).doubleValue();
	}

	public Long toNumber(Object nmbr) {
		Long result = 0L;
		
		if (nmbr == null) {
			registerError(NULL_OBJECT);
			
			return 0L;
		}

		switch (getType(nmbr)) {
		case "String":
			result = Long.valueOf((String) nmbr);
			break;

		case "Double":
			result = new Double((Double) nmbr).longValue();
			break;

		case "Integer":
			result = new Long((Integer) nmbr).longValue();
			break;

		case "Long":
			result = (Long) nmbr;
			break;
			
		default:
			registerError(INVALID_ARG);
			break;
		}

		return result;
	}

	public Double toDecimal(Object decimal) {
		Double result = 0.0;

		if (decimal == null) {
			registerError(NULL_OBJECT);
			
			return 0.0;
		}

		switch (getType(decimal)) {
		case "String":
			result = Double.valueOf((String) decimal);
			break;

		case "Double":
			result = (Double) decimal;
			break;

		case "Integer":
			result = new Integer((Integer) decimal).doubleValue();
			break;

		case "Long":
			result = new Long((Long) decimal).doubleValue();
			break;
		default:
			registerError(INVALID_ARG);
			break;
		}

		return result;
	}

	public Double absDecimal(Double arg) {
		return (arg < 0.0) ? (arg *= -1.0) : arg;
	}

	public Long absNumeric(Long arg) {
		return (arg < 0) ? (arg *= -1) : arg;
	}

	public Object exponentObject(Object l, Object r) {
		Object retObj = null;
		if (l == null || r == null) {
			registerError(NULL_OBJECT);
			
			return null;
		}

		retObj = (double) Math.pow(Double.valueOf(String.valueOf(l)), Double.valueOf(String.valueOf(r)));

		return retObj;
	}

	public Object addObject(Object l, Object r) {
		if (l == null || r == null) {
			registerError(NULL_OBJECT);
			
			return null;
		}

		String lName = getType(l);
		String rName = getType(r);
		Object retObj = null;
		switch (lName) {
		case "Double":
			retObj = (Double) l + (Double) r;
			break;

		case "Long":
			retObj = (Long) l + (Long) r;
			break;

		case "String":
			switch (rName) {
			case "Double":
				retObj = ((String) l).concat(String.valueOf((Double) r));
				break;

			case "Long":
				retObj = ((String) l).concat(String.valueOf((Long) r));
				break;

			case "String":
				retObj = ((String) l).concat((String) r);
				break;

			case "Date":
				Calendar c = Calendar.getInstance();
				c.setTime((Date) r);
				retObj = ((String) l).concat(String.format("%1$tY-%1$tm-%1$te", c));
				break;

			case "Boolean":
				boolean bVal = (boolean) r;
				if (bVal == true) {
					retObj = ((String) l).concat("true");
				} else if (bVal == false) {
					retObj = ((String) l).concat("false");
				}
				
			default:
				registerError(INVALID_ARG);
				break;

			}
			break;

		case "Date":
			Calendar c = Calendar.getInstance();
			c.setTime((Date) l);
			c.add(Calendar.DATE, (Integer) Integer.valueOf(String.valueOf((Long) r)));
			retObj = (Date) c.getTime();
			break;
		default:
			registerError(INVALID_ARG);
			break;
		}

		return retObj;
	}

	public Object subObject(Object l, Object r) {
		if (l == null || r == null) {
			registerError(NULL_OBJECT);
			
			return null;
		}

		String lName = getType(l);
		Object retObj = null;

		switch (lName) {
		case "Double":
			retObj = (Double) l - (Double) r;
			break;

		case "Long":
			retObj = (Long) l - (Long) r;
			break;

		case "Date":
			Calendar c = Calendar.getInstance();
			c.setTime((Date) l);
			c.add(Calendar.DATE, (Integer) (Integer.valueOf(String.valueOf((Long) r)) * -1));
			retObj = (Date) c.getTime();
		default:
			registerError(INVALID_ARG);
			break;
		}

		return retObj;
	}

	public Object multObject(Object l, Object r) {
		if (l == null || r == null) {
			registerError(NULL_OBJECT);
			
			return null;
		}

		Object retObj = null;
		String lName = getType(l);

		switch (lName) {
		case "Double":
			retObj = (Double) l * (Double) r;
			break;

		case "Long":
			retObj = (Long) l * (Long) r;
			break;
		default:
			registerError(INVALID_ARG);
			break;
		}

		return retObj;
	}

	public Object divObject(Object l, Object r) {
		String lName = getType(l);
		Object retObj = null;

		if (l == null || r == null) {
			registerError(NULL_OBJECT);
			
			return null;
		}

		switch (lName) {
		case "Double":
			if ((Double) r == 0) {
				registerError(DIVIDE_BY_ZERO);
				
				break;
			}
			retObj = (Double) l / (Double) r;
			break;

		case "Long":
			if ((Long) r == 0) {
				registerError(DIVIDE_BY_ZERO);
				break;				
			}
			retObj = (Long) l / (Long) r;
			break;

		default:
			registerError(INVALID_ARG);
			break;
		}

		return retObj;
	}

	public Object modObject(Object l, Object r) {
		String lName = getType(l);
		Object retObj = null;
		
		if (l == null || r == null) {
			registerError(NULL_OBJECT);
			
			return null;
		}

		switch (lName) {
		case "Long":
			retObj = (Long) l % (Long) r;
			break;
			
		default:
			registerError(INVALID_ARG);
			break;
		}

		return retObj;
	}

	public Object getExpression(Object l, String op, Object r) {
		String lName = getType(l);
		
		if ( l == null || r == null ) {
			registerError(NULL_OBJECT);
		
			return null;
		}
		
		String rName = getType(r);
		if (lName.equals(rName) == false && "String".compareTo(lName) != 0 && "Date".compareTo(lName) != 0) {
			return null;
		}
		Object retObj = null;
		switch (op) {
		case "+":
			retObj = addObject(l, r);
			break;

		case "-":
			retObj = subObject(l, r);
			break;

		case "*":
			retObj = multObject(l, r);
			break;

		case "/":
			retObj = divObject(l, r);
			break;

		case "%":
			retObj = modObject(l, r);
			break;

		case "^":
			retObj = exponentObject(l, r);
			break;
			
		default:
			registerError(INVALID_OPERATOR);
			break;
		}

		return retObj;
	}

	public boolean evaluateLogic(boolean lh, String op, boolean rh) {
		boolean retVal = false;
		switch (op) {
		case "&&":
			if (lh == true && rh == true) {
				retVal = true;
			}
			break;

		case "||":
			if (lh == true || rh == true) {
				retVal = true;
			}
			break;

		case "^^":
			if (lh == true || rh == true) {
				retVal = true;
			}
			if (lh == true && rh == true) {
				retVal = false;
			}
		default:
			registerError(INVALID_OPERATOR);
			break;
		}

		return retVal;
	}

	public boolean evaluateExpression(Object lh, String op, Object rh) {
		boolean retVal = false;
		if (lh == null || rh == null) {
			registerError(NULL_OBJECT);
			
			return false;	
		}
		switch (op) {
		case "==":
			retVal = equalsObject(lh, rh);
			break;

		case "!=":
			retVal = notEqualsObject(lh, rh);
			break;

		case "<=":
			retVal = lessThanOrEqualsObject(lh, rh);
			break;

		case ">=":
			retVal = greaterThanOrEqualsObject(lh, rh);
			break;

		case "<":
			retVal = lessThanObject(lh, rh);
			break;

		case ">":
			retVal = greaterThanObject(lh, rh);
			break;
		default:
			registerError(INVALID_OPERATOR);
			break;
		}

		return retVal;
	}

	public boolean equalsObject(Object l, Object r) {
		boolean retVal = false;
		
		if (l == null || r == null) {
			registerError(NULL_OBJECT);
			
			return false;	
		}
		
		String lName = getType(l);
		switch (lName) {
		case "Double":
			double dLeft = (double) l;
			double dRight = (double) r;
			if (dLeft == dRight) {
				retVal = true;
			}
			break;

		case "Long":
			long lLeft = (long) l;
			long rRight = (long) r;
			if (lLeft == rRight) {
				retVal = true;
			}
			break;

		case "Date":
			Date dtLeft = (Date) l;
			Date dtRight = (Date) r;

			if (dtLeft.compareTo(dtRight) == 0) {
				retVal = true;
			}
			break;

		case "String":
			String sLeft = (String) l;
			String sRight = (String) r;

			if (sLeft.compareTo(sRight) == 0) {
				retVal = true;
			}
			break;

		case "Boolean":
			boolean bLeft = (boolean) l;
			boolean bRight = (boolean) r;
			if (bLeft == bRight) {
				retVal = true;
			}
			break;
			
		default:
			registerError(INVALID_ARG);
			break;
		}

		return retVal;
	}

	public boolean notEqualsObject(Object l, Object r) {
		boolean retVal = false;
		
		if (l == null || r == null) {
			registerError(NULL_OBJECT);
			
			return false;	
		}
		
		String lName = getType(l);
		switch (lName) {
		case "Double":
			double dLeft = (double) l;
			double dRight = (double) r;
			if (dLeft != dRight) {
				retVal = true;
			}
			break;

		case "Long":
			long lLeft = (long) l;
			long lRight = (long) r;
			if (lLeft != lRight) {
				retVal = true;
			}
			break;

		case "Date":
			Date dtLeft = (Date) l;
			Date dtRight = (Date) r;
			if (dtLeft.compareTo(dtRight) != 0) {
				retVal = true;
			}
		case "String":
			String sLeft = (String) l;
			String sRight = (String) r;

			if (sLeft.compareTo(sRight) != 0) {
				retVal = true;
			}
			break;

		case "Boolean":
			boolean bLeft = (boolean) l;
			boolean bRight = (boolean) r;
			if (bLeft != bRight) {
				retVal = true;
			}
			break;
			
		default:
			registerError(INVALID_ARG);
			break;
		}

		return retVal;
	}

	public boolean lessThanOrEqualsObject(Object l, Object r) {
		boolean retVal = false;
		
		if (l == null || r == null) {
			registerError(NULL_OBJECT);
			
			return false;	
		}
		
		String lName = getType(l);
		switch (lName) {
		case "Double":
			double dLeft = (double) l;
			double dRight = (double) r;
			if (dLeft <= dRight) {
				retVal = true;
			}
			break;

		case "Long":
			long lLeft = (long) l;
			long lRight = (long) r;
			if (lLeft <= lRight) {
				retVal = true;
			}
			break;

		case "Date":
			Date dtLeft = (Date) l;
			Date dtRight = (Date) r;
			if (dtLeft.compareTo(dtRight) <= 0) {
				retVal = true;
			}

		case "String":
			String sLeft = (String) l;
			String sRight = (String) r;

			if (sLeft.compareTo(sRight) <= 0) {
				retVal = true;
			}
			
		default:
			registerError(INVALID_ARG);
			break;
		}

		return retVal;
	}

	public boolean greaterThanOrEqualsObject(Object l, Object r) {
		boolean retVal = false;
		
		if (l == null || r == null) {
			registerError(NULL_OBJECT);
			
			return false;	
		}
		
		String lName = getType(l);
		switch (lName) {
		case "Double":
			double dLeft = (double) l;
			double dRight = (double) r;
			if (dLeft >= dRight) {
				retVal = true;
			}
			break;

		case "Long":
			long lLeft = (long) l;
			long lRight = (long) r;
			if (lLeft >= lRight) {
				retVal = true;
			}
			break;

		case "Date":
			Date dtLeft = (Date) l;
			Date dtRight = (Date) r;
			if (dtLeft.compareTo(dtRight) >= 0) {
				retVal = true;
			}

		case "String":
			String sLeft = (String) l;
			String sRight = (String) r;

			if (sLeft.compareTo(sRight) >= 0) {
				retVal = true;
			}
			
		default:
			registerError(INVALID_ARG);
			break;
		}

		return retVal;
	}

	public boolean lessThanObject(Object l, Object r) {
		boolean retVal = false;
		
		if (l == null || r == null) {
			registerError(NULL_OBJECT);
			
			return false;	
		}
		
		String lName = getType(l);
		switch (lName) {
		case "Double":
			double dLeft = (double) l;
			double dRight = (double) r;
			if (dLeft < dRight) {
				retVal = true;
			}
			break;

		case "Long":
			long lLeft = (long) l;
			long lRight = (long) r;
			if (lLeft < lRight) {
				retVal = true;
			}
			break;

		case "Date":
			Date dtLeft = (Date) l;
			Date dtRight = (Date) r;
			if (dtLeft.compareTo(dtRight) < 0) {
				retVal = true;
			}

		case "String":
			String sLeft = (String) l;
			String sRight = (String) r;

			if (sLeft.compareTo(sRight) < 0) {
				retVal = true;
			}
			
		default:
			registerError(INVALID_ARG);
			break;
		}

		return retVal;
	}

	public boolean greaterThanObject(Object l, Object r) {
		boolean retVal = false;
		
		if (l == null || r == null) {
			registerError(NULL_OBJECT);
			
			return false;	
		}
		
		String lName = getType(l);
		switch (lName) {
		case "Double":
			double dLeft = (double) l;
			double dRight = (double) r;
			if (dLeft > dRight) {
				retVal = true;
			}
			break;

		case "Long":
			long lLeft = (long) l;
			long lRight = (long) r;
			if (lLeft > lRight) {
				retVal = true;
			}
			break;

		case "Date":
			Date dtLeft = (Date) l;
			Date dtRight = (Date) r;
			if (dtLeft.compareTo(dtRight) > 0) {
				retVal = true;
			}

		case "String":
			String sLeft = (String) l;
			String sRight = (String) r;

			if (sLeft.compareTo(sRight) > 0) {
				retVal = true;
			}
			
		default:
			registerError(INVALID_ARG);
			break;
		}

		return retVal;
	}

	public String getType(Object obj) {

		return obj.getClass().getSimpleName();
	}

	/*************************************************************************
	 * End of ObjectMath
	 *************************************************************************/
	/********************************************************************
	 * The following are abstract functions.
	 ********************************************************************/
	
	//Transaction functions
	public abstract void beginTrans();

	public abstract void commitTrans();

	public abstract void rollback();

	//Accounting functions
	public abstract void credit(Double amount, String account);

	public abstract void debit(Double amount, String account);

	public abstract void ledger(char type, Double amount, String account, String description);

	public abstract void inventoryLedger(char type, Double qty, Double amount, String description);

	public abstract double getBalance(String account);

	// Miscellaneous
	public abstract Object lookup(String sql, Object... args);

	public abstract void update(String sql, int limit, Object... args);

	public abstract Set<Object> list(String sql, int limit, Object... args);

	public abstract void merge(Object record);

	public abstract void insert(Object record);

	public abstract void delete(Object record);

	public abstract void fetalLogger(String clss, String msg);

}
