package com.bo.model;

import com.jdbc.mapper.EmployeeMapper;

public class Employee {

	private int no;
	private String name;
	private String job;
	private Double salary;

	private EmployeeMapper empMap;

	public void setEmpMap(EmployeeMapper empMap) {
		this.empMap = empMap;
	}

	public void setNo(int no) {
		this.no = no;
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

	public int getNo() {
		return no;
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

	public EmployeeMapper getEmpMap() {
		return empMap;
	}

	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", job=" + job + ", salary=" + salary + "]\n";
	}

}