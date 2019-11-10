package com.baliase.beans;

public class Parent {
	
	private String userId;
	private String userName;
	private String email;
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Parent [userId=" + userId + ", userName=" + userName + ", email=" + email + "]";
	}
	
	

}
