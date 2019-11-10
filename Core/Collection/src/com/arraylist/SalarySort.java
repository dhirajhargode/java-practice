package com.arraylist;

import java.util.Comparator;

public class SalarySort implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getSalary().compareTo(emp2.getSalary());
	}

	
}
