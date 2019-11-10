package com.sarang.domain;

public class PhoneNo {
	private String phId;
	private String type;

	public PhoneNo() {
		System.out.println("0 - param constructor of phoneNo class");
	}

	public String getPhId() {
		return phId;
	}

	public void setPhId(String phId) {
		this.phId = phId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
