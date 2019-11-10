package com.test;
import com.collection.Employee;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo{
	
	public static void main(String[] args){
		
		Employee e1 = new Employee("Dhiraj",110,50000.00,"Male");
		Employee e2 = new Employee("Suraj",105,15000.00,"Male");
		
		
		//System.out.println(e1.equals(e2));
		
		Employee e3 = null;
		//System.out.println(e1.equals(e3));
		
		Test t = null;
		//System.out.println(e1.equals(t));
		
		//hashCode()
		//System.out.println(e2.hashCode());
		
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(e1);
		list.add(e2);
		list.add(e1);
		
		// all list
		//System.out.println(list);
		
		Iterator<Employee> itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}
	
}