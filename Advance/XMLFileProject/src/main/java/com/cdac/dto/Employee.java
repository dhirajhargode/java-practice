package com.cdac.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="Employee_Details")
public class Employee {

	@Id
	@Column(name="emp_id")
	private Integer empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="basic_salary")
	private Double salary;
	
	@Column(name="hire_date")
	@Temporal(TemporalType.DATE)
	private Date date;

	public Employee() {
		super();
	}

	public Employee(Integer empId, String empName, Double salary, Date date) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", date=" + date + "]";
	}

}
