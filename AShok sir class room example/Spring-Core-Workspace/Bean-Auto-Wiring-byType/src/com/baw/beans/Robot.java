package com.baw.beans;

public class Robot {

	private Integer robotId;
	private String robotType;

	private Chip chip;

	public Integer getRobotId() {
		return robotId;
	}

	public void setRobotId(Integer robotId) {
		this.robotId = robotId;
	}

	public String getRobotType() {
		return robotType;
	}

	public void setRobotType(String robotType) {
		this.robotType = robotType;
	}

	public Chip getChip() {
		return chip;
	}

	public void setChip(Chip chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Robot [robotId=" + robotId + ", robotType=" + robotType + ", chip=" + chip + "]";
	}

}
