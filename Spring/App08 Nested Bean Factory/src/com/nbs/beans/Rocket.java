package com.nbs.beans;

public class Rocket {

	private Integer rocketId;
	private String rocketName;
	private Fuel fuel;

	public Integer getRocketId() {
		return rocketId;
	}

	public void setRocketId(Integer rocketId) {
		this.rocketId = rocketId;
	}

	public String getRocketName() {
		return rocketName;
	}

	public void setRocketName(String rocketName) {
		this.rocketName = rocketName;
	}
	
	

	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Rocket [rocketId=" + rocketId + ", rocketName=" + rocketName + ", fuel=" + fuel + "]";
	}

	
}
