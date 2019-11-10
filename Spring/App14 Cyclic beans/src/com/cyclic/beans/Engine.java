package com.cyclic.beans;

public class Engine {

	private String EngName;
	private String EngType;

	public void setEngName(String engName) {
		EngName = engName;
	}

	public String getEngName() {
		return EngName;
	}

	public void setEngType(String engType) {
		EngType = engType;
	}

	public String getEngType() {
		return EngType;
	}

	@Override
	public String toString() {
		return "Engine [EngName=" + EngName + ", EngType=" + EngType + "]";
	}
	
	
}
