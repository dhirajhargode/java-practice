package com.sarang.domain;

import java.util.Set;

public class User {
	private String userId;
	private String fname;
	private Set<PhoneNo> phone;

	public User() {
		System.out.println("0 - param constructor of User class");
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Set<PhoneNo> getPhone() {
		return phone;
	}

	public void setPhone(Set<PhoneNo> phone) {
		this.phone = phone;
	}

}
