package com.bl.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Motor {

	private Integer id;
	private String type;

	public void start() throws Exception {
		System.out.println("Motor started...");
	}

	public void doWork() {
		System.out.println("Performing action....");
	}

	public void stop() throws Exception {
		System.out.println("Motor is going to stop..");
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

}
