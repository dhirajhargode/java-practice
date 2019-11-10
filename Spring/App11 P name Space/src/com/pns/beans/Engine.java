package com.pns.beans;

public class Engine {
	
	private Integer engineId;
	private String engineName;
	
	public Engine() {
		System.out.println("Engine 0  param constructor.....");
	}

	public void setEngineId(Integer engineId) {
		this.engineId = engineId;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineName=" + engineName + "]";
	}
	
	   

}
