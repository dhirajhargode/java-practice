package com.bs.model;

public class EmployeeBO {

	private int eid;
	private String name;
	private String job;
	private Double sal;

	public EmployeeBO() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeBO(int eid, String name, String job, Double sal) {
		this.eid = eid;
		this.name = name;
		this.job = job;
		this.sal = sal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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
		return "EmployeeBO [eid=" + eid + ", name=" + name + ", job=" + job + ", sal=" + sal + "]";
	}

}
