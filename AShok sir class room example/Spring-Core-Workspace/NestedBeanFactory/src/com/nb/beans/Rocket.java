package com.nb.beans;

public class Rocket {

	private Integer rocketId;
	private String RocketName;
	private Fuel fuel;

	public void setRocketId(Integer rocketId) {
		this.rocketId = rocketId;
	}

	public void setRocketName(String rocketName) {
		RocketName = rocketName;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Rocket [rocketId=" + rocketId + ", RocketName=" + RocketName + ", fuel=" + fuel + "]";
	}

}
