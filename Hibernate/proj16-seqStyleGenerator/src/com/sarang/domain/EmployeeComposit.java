package com.sarang.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "annotation")
public class EmployeeComposit {
	private int eid;
	private String fname;
	private String lname;
	private String mail;

	public void setEid(int eid) {
		this.eid = eid;
		System.out.println("setter method of EID is executing");

	}

	@Id
	@Column(name = "annotation")
	@Type(type = "int")
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
