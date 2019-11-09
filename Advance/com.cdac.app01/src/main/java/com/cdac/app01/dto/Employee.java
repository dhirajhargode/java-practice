package com.cdac.app01.dto;

import java.util.Date;

public class Employee {

	private Integer empId = null;
	private String empName = null;
	private Double basicSalary = null;
	private Date date = null;

	public Employee() {
		super();
	}

	public Employee(Integer empId, String empName, Double basicSalary, Date date) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.date = date;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
