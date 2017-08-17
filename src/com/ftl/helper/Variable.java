package com.ftl.helper;

public class Variable {
	private String name;
	private VariableType Type;
	private Object value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public VariableType getType() {
		return Type;
	}
	public void setType(VariableType type) {
		Type = type;
	}

}
