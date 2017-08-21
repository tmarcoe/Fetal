package com.ftl.app;

import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import com.ftl.derived.FetalParser;
import com.ftl.derived.FetalParser.BlockContext;
import com.ftl.derived.FetalParser.TransactionContext;
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
	

	public void showGuiTree(FetalParser parser, TransactionContext tree ) {
        JFrame frame = new JFrame("Fetal Tree");
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
