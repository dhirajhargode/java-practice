package com.sarang.domain;

public class Employee {
	private int eid;
	private String ename;
	private String lname;
	private String mail;

	public int getEid() {
		System.out.println("getter method of eid");
		return eid;
	}

	public void setEid(int eid) {
		System.out.println("Setter method of eid");
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String fname) {
		this.ename = fname;
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
