package com.sarang.domain;

public class Employee extends Person {
	private int salary;
	private String department;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
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
		return super.toString() + " Employee [salary=" + salary + ", department=" + department + "]";
	}

}
