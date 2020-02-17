
package com.ArrayListDemo;
import com.collection.Employee;

import java.util.TreeSet;
import java.util.Iterator;
 class TreeSetDemo{
 	
	public static void main(String[] args){
		
		Employee e1 = new Employee("Dhiraj",102,50000.00,"Male");
		Employee e2 = new Employee("Suraj",101,150000.00,"Male");
		Employee e3 = new Employee("Payal",103,100000.00,"Female");
		Employee e4 = new Employee("Sagar",105,25000.00,"Male");
		Employee e5 = new Employee("Sahil",106,105000.00,"Male");
		Employee e6 = new Employee("Shivani",104,30000.00,"Female");
		
		TreeSet<Employee> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
	
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
 }