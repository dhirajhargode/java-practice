package com.nt.model;

public class EmployeeBO {

	private int eno;
	private String name;
	private String job;
	private Double salary;

	public EmployeeBO() {
	}

	public EmployeeBO(int eno, String name, String job, Double salary) {
		this.eno = eno;
		this.name = name;
		this.job = job;
		this.salary = salary;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public int getEno() {
		return eno;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "\nStudentBO [eno=" + eno + ", name=" + name + ", job=" + job + ", salary=" + salary + "]";
	}

}
