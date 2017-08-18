package com.ftl.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import javax.xml.parsers.ParserConfigurationException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.xml.sax.SAXException;

import com.ftl.derived.FetalLexer;
import com.ftl.derived.FetalParser;
import com.ftl.derived.FetalParser.BlockContext;
import com.ftl.derived.FetalParser.TransactionContext;

public abstract class FetalTransaction {

	private String Description = "";
	private long errorCount = 0;
	private Map<String, Variable> variables = new HashMap<String, Variable>();
	private Map<String, String> accountNames = new HashMap<String, String>();
	private Properties props;
	private String errMsg = "";
	private boolean debugMode = false;
	private SalesHeader header = new SalesHeader();
	private Map<String, SalesItem> items = new HashMap<String, SalesItem>();

	/*********************************************************************
	 * Initialize Transaction This clears all variables and the internal sales
	 * receipt
	 *********************************************************************/
	@Deprecated
	public void initTransaction() {
		clearVariables();
		clearSalesItems();
		clearMap();
	}

	public void handleError(String msg) {
		errorCount++;
		errMsg = msg;	
	}
	public void initTransaction(String setupUrl) throws IOException {
		URL url = new URL(setupUrl);
		InputStream in = url.openStream();
		Reader reader = new InputStreamReader(in);
		props = new Properties();
		props.load(reader);
		clearVariables();
		clearSalesItems();
		clearMap();
	}
	
	public void clearVariables() {
		variables.clear();
	}

	public void clearMap() {
		accountNames.clear();
	}
	public void clearSalesItems() {
		items.clear();
		setAmount(0);
		setTax(0);
		setTotalItems(0);
		setShipCharges(0);
		setAddedCharges(0);
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

	public String getErrMsg() {
		String msg = errMsg;
		errMsg = "";

		return msg;
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

	public Properties getProps() {
		return props;
	}

	/****************************************************************************
	 * 
	 * Setters and Getters from the Sales header.
	 ****************************************************************************/

	public SalesHeader getHeader() {
		return header;
	}

	public void setHeader(SalesHeader header) {
		this.header = header;
	}

	public double getAmount() {
		return header.getTotalPrice();
	}

	public void setAmount(double amount) {
		header.setTotalPrice(amount);
	}

	public double getTax() {
		return header.getTotalTax();
	}

	public void setTax(double tax) {
		header.setTotalTax(tax);
	}

	public long getTotalItems() {
		return header.getTotalItems();
	}

	public void setTotalItems(long totalItems) {
		header.setTotalItems(totalItems);
	}

	public double getAddedCharges() {
		return header.getAddedCharges();
	}

	public void setAddedCharges(double addedCharges) {
		header.setAddedCharges(addedCharges);
	}

	public double getShipCharges() {
		return header.getTotalShipping();
	}

	public void setShipCharges(double shipCharges) {
		header.setTotalShipping(shipCharges);
	}
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
	/******************************************************************
	 * Keep track of errors
	 ******************************************************************/
	public boolean hasErrors() {
		return (errorCount > 0);
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

	public void addVariable(String name, VariableType type, Object value) {
		Variable var = new Variable();

		var.setType(type);
		var.setValue(value);
		var.setName(name);

		variables.put(name, var);
	}

	public void addVariable(String name, VariableType type) {
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
			if (var.getType() == VariableType.DOUBLE) {
				return Double.valueOf(String.valueOf(var.getValue()));
			}else if (var.getType() == VariableType.LONG) {
				return Long.valueOf(String.valueOf(var.getValue()));
			}else if (var.getType() == VariableType.BOOLEAN) {
				return (boolean) var.getValue();
			}else if (var.getType() == VariableType.STRING) {
				return String.valueOf(var.getValue());
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
			// TODO Auto-generated catch block
			e.printStackTrace();
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
				m = obj.getClass().getMethod(method, cls );
				o = m.invoke(obj, args);
			}else {
				m = obj.getClass().getMethod(method, null);
				o = m.invoke(obj, null);				
			}
			
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return o;
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


	public long getItemQty(String sku) {
		SalesItem sales = items.get(sku);
		if (sales == null) {
			return 0;
		}

		return sales.getQty();
	}

	public double getItemPrice(String sku) {
		SalesItem sales = items.get(sku);
		if (sales == null) {
			return 0.0;
		}
		return sales.getPrice();
	}

	public double getItemTax(String sku) {
		SalesItem sales = items.get(sku);

		if (sales == null) {
			return 0.0;
		}

		return sales.getTax();
	}

	public long getItemCount() {
		if (header == null) {
			return 0;
		}

		return header.getTotalItems();
	}

	public double getItemTotal() {
		if (header == null) {
			return 0.0;
		}
		double total = 0.0;
		Iterator<Entry<String,SalesItem>> it = items.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String,SalesItem> entry = it.next();
			SalesItem si = entry.getValue();
			
			total += si.getPrice();
		}
		return total;
	}

	public long getCouponCount() {
		this.getCouponCount();

		return 0;
	}

	public void addSalesItem(String sku, SalesItem item) {
		items.put(sku, item);
		setAmount(getAmount() + (item.getPrice() * item.getQty()));
		setTax(getTax() + (item.getTax() * item.getQty()));
		setTotalItems(getTotalItems() + item.getQty());
	}

	public String getLowestItem() {
		String sku = "";
		double price = 999999999;
		Iterator<Entry<String, SalesItem>> it = items.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, SalesItem> pair = it.next();
			SalesItem si = pair.getValue();
			if (si.getPrice() < price) {
				sku = pair.getKey();
				price = si.getPrice();
			}
		}

		return sku;
	}

	public String getHighestItem() {
		String sku = "";
		double price = 0;
		Iterator<Entry<String, SalesItem>> it = items.entrySet().iterator();
		while (it.hasNext()) {

			Map.Entry<String, SalesItem> pair = it.next();
			SalesItem si = pair.getValue();
			if (si.getPrice() > price) {
				sku = pair.getKey();
				price = si.getPrice();
			}
		}
		return sku;
	}

	public void commitReceipt() {
		Iterator<Entry<String, SalesItem>> it = items.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, SalesItem> pair = it.next();
			SalesItem si = pair.getValue();
			Long qty = Long.valueOf(String.valueOf(si.getQty()));
			commitStock(pair.getKey(), qty);
		}
	}

	public void depleteReceipt() {
		for (Entry<String, SalesItem> entry : items.entrySet() ) {
			SalesItem si = entry.getValue();
			String sku =  entry.getKey();
			Long qty = Long.valueOf(String.valueOf(si.getQty()));
			depleteStock(sku, qty);
		}
	}

	/******************************************************************************************
	 * Exception handling
	 * 
	 ******************************************************************************************/

	public NoViableAltException getException(String msg, ParserRuleContext context, Parser recognizer) {
		Token token = context.getStart();
		String errStr = String.format(" @ line %d, pos %d - In rule %s", token.getLine(), token.getCharPositionInLine(),
				context.getText());
		msg = msg + errStr;
		setErrMsg(msg);
		errorCount++;
		return new NoViableAltException(recognizer);
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

	@SuppressWarnings("unused")
	public void loadRule(String rule) throws IOException, RecognitionException, RuntimeException {

		URL url = new URL(props.getProperty("transactionUrl") + rule);
		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));

		ANTLRInputStream in = new ANTLRInputStream(read);
		FetalLexer lexer = new FetalLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		FetalParser parser = new FetalParser(tokens);

		parser.removeErrorListeners(); // remove ConsoleErrorListener
		parser.addErrorListener(new FetalErrorListener()); // add ours
		parser.setErrorHandler(new BailErrorStrategy());
		try {
			TransactionContext context = parser.transaction(this);
		} catch (RuntimeException e) {
			throw new RuntimeException(errMsg);
		}
	}

	@SuppressWarnings("unused")
	public void loadBlock(String rule) throws RecognitionException, IOException {
		URL url = new URL(props.getProperty("blockUrl") + rule);
		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));

		ANTLRInputStream in = new ANTLRInputStream(read);
		FetalLexer lexer = new FetalLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		FetalParser parser = new FetalParser(tokens);
		parser.removeErrorListeners(); // remove ConsoleErrorListener
		parser.addErrorListener(new FetalErrorListener()); // add ours
		try {
			BlockContext context = parser.block(this);
		} catch (RuntimeException e) {
			throw new RuntimeException(errMsg);
		}

	}

	@SuppressWarnings("unused")
	public void loadCoupon(String rule) throws IOException {
		URL url = new URL(props.getProperty("couponUrl") + rule);
		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));

		ANTLRInputStream in = new ANTLRInputStream(read);
		FetalLexer lexer = new FetalLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		FetalParser parser = new FetalParser(tokens);
		parser.removeErrorListeners(); // remove ConsoleErrorListener
		parser.addErrorListener(new FetalErrorListener()); // add ours
		try {
			TransactionContext context = parser.transaction(this);
		} catch (RuntimeException e) {
			throw new RuntimeException(errMsg);
		}
	}

	/********************************************************************
	 * The following are abstract functions.
	 ********************************************************************
	 ********************************************************************/
	/********************************************************************
	 * Transaction functions
	 ********************************************************************/
	public abstract void beginTrans();

	public abstract void commitTrans();

	/*********************************************************
	 * Accounting functions
	 *********************************************************/
	public abstract void credit(Double amount, String account);

	public abstract void debit(Double amount, String account);

	public abstract void ledger(char type, Double amount, String account, String description);

	public abstract double getBalance(String account);

	/***********************************************************************************
	 * Inventory functions
	 ************************************************************************************/
	public abstract void addStock(String sku, Long qty);

	public abstract void depleteStock(String sku, Long qty);

	public abstract void commitStock(String sku, Long qty);

	/*************************************************************************************
	 * Miscellaneous
	 *************************************************************************************/

	public abstract double getRate(String Target);
	public abstract Object lookup(String table, String sql);
	public abstract List<Object> list(String table, String sql);

	public abstract String getBaseCurrency();

	public abstract Date lastRefreshDate();
	public abstract void rollback();

	public Double getDays(Date date, Date date2) {
		double diffDate =  (date2.getTime() - date.getTime()) / (1000 * 60 * 60 * 12);

		return (double) Math.round((diffDate * 4.0) / 4.0);
	}

}
