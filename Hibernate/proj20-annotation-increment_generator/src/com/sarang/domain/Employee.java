package com.sarang.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity

public class Employee {

	private int eid;
	private String ename;
	private String lname;
	private String mail;

	public void setEid(int eid) {
		this.eid = eid;
		System.out.println("setter method of EID is executing");

	}

	/*
	 * @Id
	 * 
	 * @GenericGenerator(name="gen1" ,strategy="increment")
	 * 
	 * @GeneratedValue(generator="gen1")
	 */

	
	// working with hibernate_sequence only not with kaashvi
	@Id
	@GenericGenerator(name = "gen2", strategy = "sequence", parameters = @Parameter(name = "sequence", value = "sarang008_sequence"))
	@GeneratedValue(generator = "gen2")
	
	
	public int getEid() {
		System.out.println("getter method of EID is executing");
		return eid;
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
