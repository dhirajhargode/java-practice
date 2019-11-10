package com.nit.blogic;

import java.util.ArrayList;

import com.nit.beans.Employee;

public class Company {

	private String cid = "123";
	static Company company = new Company();
	ArrayList<Employee> al = new ArrayList<>();

	// Dont delete this
	private Company() {

	}

	public static Company getCompany() {
		return company;
	}

	/*public static void setCompany(Company company) {
		Company.company = company;
	}*/
	
	public boolean loginValidate(String eid) {
		if (eid.equals(cid)) {
			return true;
		} else {
			return false;
		}
	}// validate
	
	public boolean registerd(Employee e) {
		return al.add(e);
		
	}//boolean
	
	public void display() {
		System.out.println(al);
		
	}//display

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", al=" + al + "]";
	}
	
	

}// class
