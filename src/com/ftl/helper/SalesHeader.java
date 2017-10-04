package com.ftl.helper;

public class SalesHeader {
	private int invoiceNum;
	private double totalPrice;
	private double totalTax;
	private double addedCharges;
	private double totalShipping;
	private double grandTotal;
	private long totalItems;
	public int getInvoiceNum() {
		return invoiceNum;
	}
	public void setInvoiceNum(int invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getTotalTax() {
		return totalTax;
	}
	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}
	public double getAddedCharges() {
		return addedCharges;
	}
	public void setAddedCharges(double addedCharges) {
		this.addedCharges = addedCharges;
	}
	public double getTotalShipping() {
		return totalShipping;
	}
	public void setTotalShipping(double totalShipping) {
		this.totalShipping = totalShipping;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public long getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(long totalItems) {
		this.totalItems = totalItems;
	}
	
	
	
}
