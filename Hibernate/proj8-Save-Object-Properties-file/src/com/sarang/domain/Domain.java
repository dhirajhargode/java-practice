package com.sarang.domain;

public class Domain {

	private int id;
	private String fname;
	private String lname;
	private String mail;
	public int getId() {
		System.out.println("getter method of id");
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("setter method of ID");
	}
	public String getFname() {
		System.out.println("getter method of fname");
		return fname;
		
	}
	public void setFname(String fname) {
		this.fname = fname;
		System.out.println("setter method of fname");
	}
	public String getLname() {
		System.out.println("getter method of lname");
		return lname;
		
	}
	public void setLname(String lname) {
		System.out.println("setter method of lname");
		this.lname = lname;
	}
	public String getMail() {
		System.out.println("getter method of mail");
		return mail;
	}
	public void setMail(String mail) {
		System.out.println("setter method of lname");
		this.mail = mail;
	}
	
}
