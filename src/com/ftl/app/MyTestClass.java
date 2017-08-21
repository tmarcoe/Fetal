package com.ftl.app;

public class MyTestClass {
	
	public void toPrint() {
		System.out.println("It works!!!!");
	}
	
	public Long assignValue() {
		return Long.valueOf(5);
	}
	
	public double getFive(Double five) {
		System.out.println("It's Five!!!");
		return five;
	}
	public double multiply(Double a, Double b) {
		return a * b;
	}
}
