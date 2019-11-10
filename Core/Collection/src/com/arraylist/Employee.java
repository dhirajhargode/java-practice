package com.arraylist;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {

	private String empName;
	private Integer empId;
	private Double salary;
	private String gender;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, Integer empId, Double salary, String gender) {
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
		this.gender = gender;
	}

	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int compareTo(Employee o) {
		
		return getEmpId().compareTo(o.empId);
	}
	
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}
	
	
	@Override
	public boolean equals(Object obj) {
		try {
			Employee emp = (Employee) obj;
			if (this.empId.equals(emp.empId) && this.empName.equals(emp.empName) && this.salary.equals(emp.salary)
					&& this.gender.equals(emp.gender))
				return true;

		} catch (ClassCastException | NullPointerException e) {
			return false;
		}
		return false;

	}

	@Override
	public int hashCode() {
		Integer prime = 17;
		Integer result = 1;

		result = result + prime * this.empId.hashCode();
		result = result + prime * this.empName.hashCode();
		result = result + prime * this.salary.hashCode();
		result = result + prime * this.gender.hashCode();

		return result;
	}

	@Override
	public String toString() {
		return "EMPLOYEE => Id : " + getEmpId() + ", Name : " + getEmpName() + ", Salary : " + getSalary()
				+ ", Gender : " + getGender();

	}
}
