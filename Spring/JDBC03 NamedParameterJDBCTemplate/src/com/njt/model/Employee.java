package com.njt.model;

public class Employee {

	private int eno;
	private String name;
	private String job;
	private Double sal;

	public Employee() {
	}

	public Employee(int eno, String name, String job, Double sal) {
		this.eno = eno;
		this.name = name;
		this.job = job;
		this.sal = sal;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", job=" + job + ", sal=" + sal + "]";
	}

}
