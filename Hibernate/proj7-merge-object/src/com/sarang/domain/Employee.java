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
		System.out.println("getter method of ename");
		return ename;
	}

	public void setEname(String fname) {
		System.out.println("setter method of ename");
		this.ename = fname;
	}

	public String getLname() {
		System.out.println("getter method of lname");
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
		System.out.println("setter method of lname");
	}

	public String getMail() {
		System.out.println("getter method of mail");
		return mail;
	}

	public void setMail(String mail) {
		System.out.println("setter method of mail");
		this.mail = mail;
	}

}
