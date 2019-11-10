package com.nt.bo;

public class EmpBO {

	private int no;
	private String name, job;
	private double salary;

	public EmpBO() {
		System.out.println("EmpBo : 0 param contructor");
	}

	public EmpBO(int no, String name, String job, double salary) {
		System.out.println("EmpBO : 4 param constructor ");
		this.no = no;
		this.name = name;
		this.job = job;
		this.salary = salary;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
