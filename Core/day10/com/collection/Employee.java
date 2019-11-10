
package com.collection;

public class Employee implements Comparable<Employee>{
	
	private String empName;
	private Integer empId;
	private Double salary;
	private String gender;
	
	public Employee(String empName,Integer empId,Double salary,String gender){
		
		this.empId = empId;
		this.empName = empName;
		this.salary = salary ;
		this.gender = gender ;
		
	}
	
	public void setEmpName(String empName){
		this.empName = empName ; 
	}
	public String getEmpName(){
		return this.empName ;
	}
	
	public void setEmpId(Integer empId){
		this.empId = empId ;
	}
	
	public Integer getEmpId(){
		return this.empId ;
	}
	
	public void setSalary(Double salary){
		this.salary = salary ;
	}
	public Double getSalary(){
		return this.salary;
	}
	public void setGender(String gender){
		this.gender = gender ;
	}
	public String getGender(){
		return this.gender ;
	}
	
	
	public int compareTo(Employee emp){
		return getEmpId().compareTo(emp.getEmpId());
	}
	
	public boolean equals(Object o){
		
		try{
			Employee emp = (Employee)o;
			if(this.empId.equals(emp.empId) && this.empName.equals(emp.empName) && this.salary.equals(emp.salary) && this.gender.equals(emp.gender))
				return true;
			
		}catch(ClassCastException | NullPointerException e){
			return false;
		}
		return false;
	}
	
	public int hashCode(){
		Integer prime = 17;
		Integer result = 1;
		
		result = result + prime * this.empId.hashCode();
		result = result + prime * this.empName.hashCode();
		result = result + prime * this.salary.hashCode();
		result = result + prime * this.gender.hashCode();

		return result;
	}
	
	public String toString(){
		return " EMPLOYEE => Id : " + getEmpId() + ", Name : " + getEmpName() + ", Salary : " + getSalary() + ", Gender : " + getGender();
	}
	
	
	
}