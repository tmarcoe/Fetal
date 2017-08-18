package com.ftl.app;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import com.ftl.derived.FetalParser;
import com.ftl.derived.FetalParser.BlockContext;
import com.ftl.derived.FetalParser.TransactionContext;
import com.ftl.helper.SalesItem;
import com.ftl.helper.FetalTransaction;

public class TransactionService extends FetalTransaction {
	
	
	
	/********************************************************************
	 * Transaction functions
	 ********************************************************************/
	@Override
	public void beginTrans() {
		System.out.println("beginTrans");
	}
	
	@Override
	public void commitTrans() {
		System.out.println("commitTrans");
	}

	/*********************************************************
	 * Accounting functions
	 *********************************************************/	
	
	@Override
	public void credit(Double amount, String account) {
		account = this.getMap(account);
		System.out.printf("credit( %.02f, %s)\n",amount, account);
	}
	
	@Override
	public void debit(Double amount, String account) {
		account = this.getMap(account);
		System.out.printf("debit( %.02f, %s)\n",amount, account);
	}
	
	@Override
	public void ledger(char type, Double amount, String account, String description) {
		account = this.getMap(account);
		System.out.printf("ledger( %c, %.02f, %s, %s)\n", type, amount, account, description);
	}
	
	@Override
	public double getBalance(String account) {
		account = this.getMap(account);
		System.out.printf("getBalance( %s )\n", account);
		return 0.0;
	}
	
	/***********************************************************************************
	 * Inventory functions
	 ************************************************************************************/	

	public void loadSalesReceipt(String key) {
		String[] sku = {"00990099","00990098","00990097","00990096","00990095"};
		double[] price = {100, 150, 400, 300, 250};
		double[] tax = {1, 2, 1, 1, 5};
		int[] qty = {1, 1, 3, 2, 5};
		setAmount(0);
		setTax(0);
		setAddedCharges(0);
		setShipCharges(0);
		
		for (int i=0; i < 5; i++) {
			SalesItem item = new SalesItem();
			item.setPrice(price[i]);
			item.setTax(tax[i]);
			item.setQty(qty[i]);
			addSalesItem(sku[i], item);
		}
		setAddedCharges(200);
		setShipCharges(300);
	}


	public void loadSalesReceipt(Long key) {
		loadSalesReceipt(String.valueOf(key));
	}

	public void loadSalesReceipt(Integer key) {
		loadSalesReceipt(String.valueOf(key));
	}

	@Override
	public void addStock(String sku, Long qty) {
		System.out.printf("addStock(%s, %d)\n", sku, qty);
	}

	@Override
	public void depleteStock(String sku, Long qty) {
		System.out.printf("depleteStock(%s, %d)\n", sku, qty);	
	}	

	@Override
	public void commitStock(String sku, Long qty) {
		System.out.printf("commitStock(%s, %d)\n", sku, qty);
		
	}
	

	public void showGuiTree(FetalParser parser, TransactionContext tree ) {
        JFrame frame = new JFrame("Fetal Tree");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        //viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);

	}
	
	public void showGuiTree(FetalParser parser, BlockContext tree ) {
        JFrame frame = new JFrame("Block Tree");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);

	}

	@Override
	public double getRate(String target) {
		System.out.printf(" getRate(%s)\n", target);
		return 0;
	}

	@Override
	public String getBaseCurrency() {
		System.out.println("getBaseCurrency");
		return "PHP";
	}

	@Override
	public Date lastRefreshDate() {
		System.out.println("lastRefreshDate");
		return new Date();
	}

	@Override
	public void rollback() {
		System.out.print("Rolled Back");
	}

	@Override
	public Object lookup(String table, String sql) {
		System.out.printf("lookup(%s , %s)\n", table, sql);
		return null;
	}

	@Override
	public List<Object> list(String table, String sql) {
		System.out.printf("list(%s , %s)\n", table, sql);
		return null;
	}
}
