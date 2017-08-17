package com.ftl.app;

import java.io.IOException;
import java.text.ParseException;
import org.apache.log4j.Logger;

import com.ftl.helper.FetalErrorListener;
import com.ftl.helper.FetalTransaction;
import com.ftl.helper.SalesItem;
import com.ftl.helper.VariableType;


public class TestAntlr {
	private static Logger logger = Logger.getLogger(FetalErrorListener.class);	

	public static void main(String[] args) throws RuntimeException, IOException, ParseException {
		boolean handled = false;
		
		FetalTransaction trans = new TransactionService();
		trans.initTransaction("file:///Repository/config/fetal.properties");

        trans.setDebugMode(false);
        try {
    		trans.setAmount(1000);
    		trans.setTax(10);
    		trans.setDescription("Purchase of inventory (SKU #9999999)");
        	trans.addVariable("xmlFile",VariableType.STRING, "accounts.xml");
        	loadSalesReceipt("", trans);
        	trans.loadRule("purchase.trans");
        } catch (RuntimeException e) {
        	handled = true;
        	throw e;
        }finally {
        	if (trans.getErrorCount() > 0) {
        		String errMsg = trans.getErrMsg();
        		logger.error("Fetal Error: " + errMsg);
        		if (handled == false) {
        			throw new RuntimeException("Fetal Error: " + errMsg);
        		}
        	}
       	
        }
        
		trans.printVarList();
	}
	
	private static void loadSalesReceipt(String key, FetalTransaction trans) {
		String[] sku = {"00990099","00990098","00990097","00990096","00990095"};
		double[] price = {100, 150, 400, 300, 250};
		double[] tax = {1, 2, 1, 1, 5};
		int[] qty = {1, 1, 3, 2, 5};
		trans.setAmount(0);
		trans.setTax(0);
		trans.setAddedCharges(0);
		trans.setShipCharges(0);
		
		for (int i=0; i < 5; i++) {
			SalesItem item = new SalesItem();
			item.setPrice(price[i]);
			item.setTax(tax[i]);
			item.setQty(qty[i]);
			trans.addSalesItem(sku[i], item);
		}
		trans.setAddedCharges(200);
		trans.setShipCharges(300);
	}


}
