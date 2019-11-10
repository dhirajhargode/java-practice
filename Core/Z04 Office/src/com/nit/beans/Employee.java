package com.nit.beans;

public class Employee {

	private Integer eno;
	private String ename;
	private double sal;
	private String dept;

	// dont delete this
	public Employee() {
	}//constructor()

	public Employee(Integer eno, String ename, double sal, String dept) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.dept = dept;
	}//constructor(----)

	public int getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", dept=" + dept + "]\n";
	}

	
	
}
