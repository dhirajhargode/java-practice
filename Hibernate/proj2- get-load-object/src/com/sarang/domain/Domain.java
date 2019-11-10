package com.sarang.domain;

import com.sarang.proxy.proxy;

public class Domain  implements proxy{
	private int id;
	private String fname;
	private String lname;
	private String mail;

	public int getId() {
		System.out.println("getter method of ID");
		return id;
	}

	public void setId(int id) {
	
		System.out.println("setter method of ID");
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		System.out.println("setter method of fname");
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		System.out.println("setter method of lname");
		this.lname = lname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		System.out.println("setter method of mail");
		this.mail = mail;
	}

}
