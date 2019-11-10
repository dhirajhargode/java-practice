package com.sarang.domain;

public class Employee extends person {
	private String salary;
	private String department;

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", department=" + department + "]";
	}
	

}
