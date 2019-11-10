package com.sarang.domain;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "annotation")
public class Annotation {
	private int eid;
	private String fname;
	private String lname;
	private int salary;

	public void setEid(int eid) {
		this.eid = eid;
		System.out.println("setter method of EID is executing");

	}

	@Id
	@Column(name = "EID")
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
		System.out.println("setter method of salary");
	}

}
