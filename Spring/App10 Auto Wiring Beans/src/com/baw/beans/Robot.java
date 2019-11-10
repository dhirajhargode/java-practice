package com.baw.beans;

public class Robot {
	
	private Integer robotId;
	private String  robotType;
	private IChip chip1,c1;
	
	// by using constructor
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public Robot(IChip chip ) {
		this.chip1=chip;
	}
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
	public IChip getChip1() {
		return chip1;
	}
	public void setChip1(IChip chip1) {
		this.chip1 = chip1;
	}

	public IChip getC1() {
		return c1;
	}

	public void setC1(IChip c1) {
		this.c1 = c1;
	}

	@Override
	public String toString() {
		return "Robot [robotId=" + robotId + ", robotType=" + robotType + ", chip1=" + chip1 + ", c1=" + c1 + "]";
	}
	
	
	
	
	
	
	

}
