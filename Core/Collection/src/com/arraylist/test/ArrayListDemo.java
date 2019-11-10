package com.arraylist.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.arraylist.Employee;
import com.arraylist.NameSort;
import com.arraylist.SalarySort;

public class ArrayListDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("Dhiraj", 102, 50000.00, "Male");
		Employee e2 = new Employee("Suraj", 101, 150000.00, "Male");
		Employee e3 = new Employee("Payal", 103, 100000.00, "Female");
		Employee e4 = new Employee("Sagar", 105, 25000.00, "Male");
		Employee e5 = new Employee("Sahil", 106, 105000.00, "Male");
		Employee e6 = new Employee("Shivani", 104, 30000.00, "Female");

		// System.out.println(e1.equals(e2));

		// Employee e3 = null;
		// System.out.println(e1.equals(e3));

		// ArrayListDemo t = null;
		// System.out.println(e1.equals(t));

		// hashCode()
		// System.out.println(e2.hashCode());

		ArrayList<Employee> list = new ArrayList<>();

		System.out.println("IsEmpty :" + list.isEmpty());

		list.add(e1);
		list.add(e2);
		list.add(0, e3);
		list.add(1, e4);
		list.add(e5);
		list.add(e6);

		System.out.println("2nd index emp " + list.get(2));
		list.set(2, new Employee("Jaggu", 109, 20000.00, "Female"));

		Iterator<Employee> itr = list.iterator();

		System.out.println("Before remove");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();

		System.out.println("Size :: " + list.size());

		/*
		 * list.remove(2); System.out.println("After remove");
		 * 
		 * while (itr.hasNext()) { System.out.println(itr.next()); }
		 */ System.out.println("Size :: " + list.size());
		System.out.println("IsEmpty :" + list.isEmpty());

		// comparable
		Collections.sort(list);
		System.out.println("Comparable sort ");
		for (Employee e : list)
			System.out.println(e);

		//comparator
		Collections.sort(list, new Employee());
		System.out.println("Comparator Emp class Name sort ");
		for (Employee e : list)
			System.out.println(e);


		Collections.sort(list, new SalarySort());
		System.out.println("Comparator Salary sort ");
		for (Employee e : list)
			System.out.println(e);
		
		
		
		

	}
}
