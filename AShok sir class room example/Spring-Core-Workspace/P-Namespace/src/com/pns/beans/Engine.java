package com.pns.beans;

public class Engine {

	private Integer engineId;
	private String engineName;

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
