package com.ftl.app;

import java.io.IOException;
import java.text.ParseException;

import org.antlr.v4.runtime.RecognitionException;
import org.apache.log4j.Logger;

import com.ftl.derived.FetalParser;
import com.ftl.derived.FetalParser.TransactionContext;
import com.ftl.helper.FetalErrorListener;
import com.ftl.helper.VariableType;


public class TestAntlr {
	private static Logger logger = Logger.getLogger(FetalErrorListener.class);	

	public static void main(String[] args) throws RuntimeException, IOException, ParseException {
		boolean handled = false;
	
		
		TransactionService trans = new TransactionService();
		trans.setDebugMode(false);
		trans.initTransaction("file:///home/workspace/config/fetal.properties"); 

        try {
    		trans.setDescription("Purchase of inventory (SKU #9999999)");
        	Register register = new Register();
        	trans.publish("register", VariableType.DAO, register);
        	register.setId(1L);
        	register.setName("John");
        	register.setAmount(100.00);
        	register.setTax(5);
        	register.setAddedCharges(0);
        	register.setShipCharges(0);
        	trans.loadRule("new.trans");
        	FetalParser parser = trans.getfParser();
        	TransactionContext tCtx = trans.getTransCtx();
        	if (trans.isDebugMode() == true)
        		trans.showGuiTree(parser, tCtx);
        } catch (RecognitionException e) {
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
}
