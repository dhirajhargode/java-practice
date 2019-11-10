package com.sc.bo;

public class EmployeeBO {

	private int eno;
	private String name;
	private String job;
	private Double sal;

	public EmployeeBO() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeBO(int eno, String name, String job, Double sal) {
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
		return "EmployeeBO [eno=" + eno + ", name=" + name + ", job=" + job + ", sal=" + sal + "]";
	}

}
