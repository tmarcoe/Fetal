package com.ftl.app;

public class Register {
	
	private long id;
	private String name;
	private double amount;
	private double tax;
	private double shipCharges;
	private double addedCharges;
	
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getShipCharges() {
		return shipCharges;
	}
	public void setShipCharges(double shipCharges) {
		this.shipCharges = shipCharges;
	}
	public double getAddedCharges() {
		return addedCharges;
	}
	public void setAddedCharges(double addedCharges) {
		this.addedCharges = addedCharges;
	}
	
}
