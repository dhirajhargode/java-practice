package com.sarang.domain;

public class Employee {
	private int eid;
	private String fname;
	private String lname;
	private String mail;

	public void setEid(int eid) {
		this.eid = eid;
		System.out.println("setter method of EID is executing");

	}

	public int getEid() {
		System.out.println("getter method of EID is executing");
		return eid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
