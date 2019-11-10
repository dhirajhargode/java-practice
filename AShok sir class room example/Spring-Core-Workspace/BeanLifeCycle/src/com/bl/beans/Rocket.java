package com.bl.beans;

public class Rocket {

	private Integer id;
	private String type;

	/*public void start() throws Exception {
		System.out.println("Rocket started...");
	}*/

	public void doWork() {
		System.out.println("Performing action....");
	}

	/*public void stop() throws Exception {
		System.out.println("Rocket is going to stop..");
	}*/

	public void setId(Integer id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

}
