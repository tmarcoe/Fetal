package com.ftl.app;

public class MyTestClass {
	
	public void toPrint() {
		System.out.println("It works!!!!");
	}
	
	public Long assignValue() {
		return Long.valueOf(5);
	}
	
	public Long getFive(long five) {
		System.out.println("It's Five!!!");
		return five;
	}
	public double multiply(double a, long b) {
		return a * b;
	}
}
