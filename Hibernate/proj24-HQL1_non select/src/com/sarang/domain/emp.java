package com.sarang.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class emp {
	
	public emp() {
		
		System.out.println("0-param constructor execting ");
		System.out.println(this.getClass().getName());
	}
	
	
	@Id
	private int eno;
	private String ename;
	private String lname;
	private int salary;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
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
	}

	/*@Override
	public String toString() {
		return "emp [eno=" + eno + ", ename=" + ename + ", lname=" + lname + ", salary=" + salary + "]";
	}
	*/

}
