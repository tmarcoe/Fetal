package com.ftl.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import javax.xml.parsers.ParserConfigurationException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.apache.commons.lang.ClassUtils;
import org.apache.log4j.Logger;

import org.xml.sax.SAXException;

import com.ftl.derived.FetalLexer;
import com.ftl.derived.FetalParser;
import com.ftl.derived.FetalParser.BlockContext;
import com.ftl.derived.FetalParser.TransactionContext;

public abstract class FetalTransaction {
	private static Logger logger = Logger.getLogger(FetalTransaction.class);
	
	private String Description = "";
	private long errorCount = 0;
	private Map<String, Variable> variables = new HashMap<String, Variable>();
	private Map<String, String> accountNames = new HashMap<String, String>();
	private Properties props;
	private String errMsg = "";
	private boolean debugMode = false;
	private TransactionContext transCtx;
	private BlockContext blockCtx;
	private FetalParser fParser;

	
	
	public TransactionContext getTransCtx() {
		return transCtx;
	}

	public BlockContext getBlockCtx() {
		return blockCtx;
	}

	public FetalParser getfParser() {
		return fParser;
	}

	/***********************************************************************
	 * Error Handliing
	 * 
	 ***********************************************************************/
	
	final String[] errorCode = {"Variable Not Defined", "Malformed Expression", "Type cast exception", "Cannot load file", 
								"Invalid date format", "Cannot load object", "Cannot invoke method", "Invalid object",
								"Invalid argument", "Record not found"};

	public void handleError(String msg) {
		errorCount++;
		errMsg = msg;	
	}
	public String getErrMsg() {
		String msg = errMsg;
		errMsg = "";

		return msg;
	}
	public RecognitionException errorHandler(int errorNum, ParserRuleContext context, Parser parser) {
		Token token = parser.getCurrentToken();
		String errStr = String.format(" @line %d, pos %d", token.getLine(), token.getCharPositionInLine());
		String msg = errorCode[errorNum];
		msg += errStr;
		setErrMsg(msg);
		errorCount++;
		parser.notifyErrorListeners(msg);

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
		return (errorCount > 0);
	}
	

	/*********************************************************************
	 * Initialize Transaction This clears all variables and the internal sales
	 * receipt
	 *********************************************************************/
	public void initTransaction(String setupUrl) throws IOException {
		URL url = new URL(setupUrl);
		InputStream in = url.openStream();
		Reader reader = new InputStreamReader(in);
		props = new Properties();
		props.load(reader);
	}
	
	public void closeFetal() {
		clearVariables();
		clearMap();
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

	/****************************************************************************
	 * 
	 * Setters and Getters from the Sales header.
	 ****************************************************************************/


	public void putMap(String account, String name) {
		accountNames.put(account, name);
	}
	public String getMap(String name) {
		String accountNum = accountNames.get(name);
		if ( accountNum == null ) {
			accountNum = name;
		}
		
		return accountNum;
	}
	public void mapFile(String fileName) {
		List<String> namePairs;
		try {
			namePairs = new MapFile(props.getProperty("mapPath"), fileName).getMapList();
		} catch (MalformedURLException e) {
			handleError("Invalid map location");
			return;
		} catch (ParserConfigurationException e) {
			handleError("Invalid properties file");
			return;
		} catch (SAXException e) {
			handleError("Invalid map");
			return;
		} catch (IOException e) {
			handleError("Can't load map file");
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
				}else {
					return Double.valueOf(0);
				}
			}else if (var.getType() == VariableType.NUMBER) {
				if (var.getValue() != null) {
					return Long.valueOf(String.valueOf(var.getValue()));
				}else {
					return Long.valueOf(0);
				}
			}else if (var.getType() == VariableType.BOOLEAN) {
				if (var.getValue() != null) {
					return (boolean) var.getValue();
				}else {
					return false;
				}
			}else if (var.getType() == VariableType.STRING) {
				if (var.getValue() != null) {
					return String.valueOf(var.getValue());
				}else {
					return "";
				}
			}else if (var.getType() == VariableType.DATE) {
				return (Date) var.getValue();
			}else{
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
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			logger.error(e.getMessage());
			return null;
		}
		
		return obj;
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
		}else{
			args = null;
		}
		
		try {
			if (args != null) {
				m = searchForMethod(obj.getClass(), method, args);
				if (m == null) throw new NoSuchMethodException("Error: '" + 
																obj.getClass().getName() + "." + method + "()" +
																"' does not exist or it as a wrong argument signature.");
				o = m.invoke(obj, args);
			}else {
				m = obj.getClass().getMethod(method, null);
				o = m.invoke(obj, null);				
			}
			
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			logger.error(e.getMessage());
			return null;
		}
		
		return o;
	}
	
	private Method searchForMethod( Class<?> clss, String name, Object... parms ) {
	    Method[] methods = clss.getMethods();
	    for( int i = 0; i < methods.length; i++ ) {
	        // Has to be named the same of course.
	        if( !methods[i].getName().equals( name ) )
	            continue;

	        Class<?>[] types = methods[i].getParameterTypes();

	        // Does it have the same number of arguments that we're looking for.
	        if( types.length != parms.length )
	            continue;

	        // Check for type compatibility
	        if( areTypesCompatible( types, parms ) )
	            return methods[i];
	        }
	    return null;
	}
	
	private boolean areTypesCompatible( Class<?>[] types, Object[] parms) {
		boolean result = true;
		
		if (parms != null ) {
			for (int i=0; i < types.length; i++) {
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
		if (cls == boolean.class)  {
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
	
	public Double getDays(Date date, Date date2) {
		double diffDate =  (date2.getTime() - date.getTime()) / (1000 * 60 * 60 * 24);

		return (double) Math.round((diffDate * 4.0) / 4.0);
	}
	
	public String dayOfTheWeek(Date date) {
		String[] dow = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
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
	protected String translateFormat(String format) {
		StringBuilder sb = new StringBuilder(format);
		int ndx = 0;
		while ((ndx = sb.indexOf("{")) != -1) {
			if (sb.charAt(ndx + 1) == 'F') {
				sb.replace(ndx, ndx + 1, "'%t");				
				sb.replace(ndx + 4, ndx + 5, "'");
			}else if (sb.charAt(ndx + 1) == 's') {
				sb.replace(ndx, ndx + 1, "'%");				
				sb.replace(ndx + 3, ndx + 4, "'");
			}else {
				sb.replace(ndx, ndx + 1, "%");
				sb.deleteCharAt(ndx + 2);
			}
		}
		return sb.toString();
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
	 * Rule loading functions There are 3 rule loading functions: 1.) The main
	 * rule loader 2.) The block loader for 'if' statements (if statements are
	 * in blocks). 3.) The loader for coupons.
	 *******************************************************************************************/

	public void loadRule(String rule) throws IOException, RecognitionException, RuntimeException {
		URL url;
		
		if (rule.contains("//") ) {
			url = new URL(rule);
		}else{
			url = new URL(props.getProperty("transactionUrl") + rule);
		}
		
		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));

		ANTLRInputStream in = new ANTLRInputStream(read);
		FetalLexer lexer = new FetalLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		FetalParser parser = new FetalParser(tokens);
		fParser = parser;

		if (isDebugMode() == false) {
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(new FetalErrorListener()); // add ours
			parser.setErrorHandler(new BailErrorStrategy());
		}
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

	public void loadBlock(String rule) throws RecognitionException, IOException {
		URL url;
		
		if (rule.contains("//") ) {
			url = new URL(rule);
		}else{
			url = new URL(props.getProperty("blockUrl") + rule);
		}
		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));

		ANTLRInputStream in = new ANTLRInputStream(read);
		FetalLexer lexer = new FetalLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		FetalParser parser = new FetalParser(tokens);
		fParser = parser;

		parser.removeErrorListeners(); // remove ConsoleErrorListener
		parser.addErrorListener(new FetalErrorListener()); // add ours
		try {
			blockCtx = parser.block(this);
		} catch (RuntimeException e) {
			if (errMsg.length() == 0) {
				errMsg = e.toString();
				logger.error(errMsg);
			}
			throw new RuntimeException(errMsg);
		}

	}

	public void loadCoupon(String rule) throws IOException {
		URL url;
		
		if (rule.contains("//") ) {
			url = new URL(rule);
		}else{
			url = new URL(props.getProperty("couponUrl") + rule);
		}
		
		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));

		ANTLRInputStream in = new ANTLRInputStream(read);
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
		loadRule(url);
	}
	
	public void loadCoupon(File file) throws RecognitionException, IOException, RuntimeException {
		String url = file.toURI().toURL().getPath();
		loadCoupon(url);
	}
	
	public void loadBlock(File file) throws RecognitionException, IOException, RuntimeException {
		String url = file.toURI().toURL().getPath();
		loadBlock(url);
	}
	
	/********************************************************************
	 * The following are abstract functions.
	 ********************************************************************/
	/********************************************************************
	 * Transaction functions
	 ********************************************************************/
	public abstract void beginTrans();
	public abstract void commitTrans();
	public abstract void rollback();

	/*********************************************************
	 * Accounting functions
	 *********************************************************/
	public abstract void credit(Double amount, String account);
	public abstract void debit(Double amount, String account);
	public abstract void ledger(char type, Double amount, String account, String description);
	public abstract double getBalance(String account);


	/*************************************************************************************
	 * Miscellaneous
	 *************************************************************************************/

	public abstract Object lookup(String sql, Object...args);
	public abstract void update(String sql, Object...args);
	public abstract List<Object> list(String sql, Object...args);

}
