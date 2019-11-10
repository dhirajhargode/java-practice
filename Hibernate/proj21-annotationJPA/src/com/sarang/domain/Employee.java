package com.sarang.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	private int eid;
	private String ename;
	private String lname;
	private String mail;

	
 
	/*@Id
	@SequenceGenerator(name = "gen1", sequenceName = "omg", initialValue = 10, allocationSize = 3)
	@GeneratedValue(generator="gen1" , strategy=GenerationType.SEQUENCE)*/
	
	
	/*@Id
	@Column(name="emp")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
	public int getEid() {
		System.out.println("getter method of EID is executing");
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
		System.out.println("setter method of EID is executing");

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
