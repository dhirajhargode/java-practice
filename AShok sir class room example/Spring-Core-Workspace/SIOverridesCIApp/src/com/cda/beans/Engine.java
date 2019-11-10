package com.cda.beans;

public class Engine {

	private Integer engineId;
	private String engName;
	private String fuelType;

	public Integer getEngineId() {
		return engineId;
	}

	public void setEngineId(Integer engineId) {
		this.engineId = engineId;
	}

	public String getEngName() {
		return engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engName=" + engName + ", fuelType=" + fuelType + "]";
	}

}
