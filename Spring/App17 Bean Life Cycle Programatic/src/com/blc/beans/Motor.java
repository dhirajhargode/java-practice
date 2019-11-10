package com.blc.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor implements InitializingBean, DisposableBean{
	private Integer motorId;
	private String type;
	
	
	public void afterPropertiesSet() {
		System.out.println("motor start...");
	}
	
	public void doWork() {
		System.out.println("property goes to instatiate.");

	}
	
	public void destroy() {
		System.out.println("motor is going to stop....");

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
