package com.blc.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor {
	private Integer motorId;
	private String type;
	
	
	public void start() {
		System.out.println("motor starting...");
	}
	
	public void doWork() {
		System.out.println("property goes to instatiating.");

	}
	
	public void destroy() {
		System.out.println("motor is going to stoping....");

	}
	
	public Integer getMotorId() {
		return motorId;
	}
	public void setMotorId(Integer motorId) {
		this.motorId = motorId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

	
}
