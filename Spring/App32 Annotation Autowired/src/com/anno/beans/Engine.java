package com.anno.beans;

public class Engine {
	
	private int engId;
	private String engType;
	public void setEngId(int engId) {
		this.engId = engId;
	}
	public void setEngType(String engType) {
		this.engType = engType;
	}
	@Override
	public String toString() {
		return "Engine [engId=" + engId + ", engType=" + engType + "]";
	}
	
	

}
