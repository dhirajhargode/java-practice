package com.ArrayListDemo;
import com.collection.Employee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class ArrayListDemo{
	
	public static void main(String[] args){
		
		Employee e1 = new Employee("Dhiraj",102,50000.00,"Male");
		Employee e2 = new Employee("Suraj",101,150000.00,"Male");
		Employee e3 = new Employee("Payal",103,100000.00,"Female");
		Employee e4 = new Employee("Sagar",105,25000.00,"Male");
		Employee e5 = new Employee("Sahil",106,105000.00,"Male");
		Employee e6 = new Employee("Shivani",104,30000.00,"Female");
		
		//System.out.println(e1.equals(e2));
		
		//Employee e3 = null;
		//System.out.println(e1.equals(e3));
		
		ArrayListDemo t = null;
		//System.out.println(e1.equals(t));
		
		//hashCode()
		//System.out.println(e2.hashCode());
		
		ArrayList<Employee> list = new ArrayList<>();
		
		// add(E)
		list.add(e1);
		list.add(e2);

		// add(i,E)
		list.add(0,e3);
		list.add(1,e4);
		list.add(e4);
		list.add(1,e4);
		list.add(e5);
		list.add(e6);

		
		//isEmpty()
		System.out.println("IsEmpty :"+list.isEmpty());		
		
		// all list
		//System.out.println(list);
		
		// iterator()
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		// remove() set() indexOf() lastIndexOf() cotains()
		list.remove(2);
		list.set(2,new Employee("Aju",111,25000.0,"Male"));
		
		System.out.println(" indexOf() " + list.indexOf(new Employee("Sagar",105,25000.00,"Male")));
		System.out.println(" lastIndexOf() " + list.lastIndexOf(new Employee("Sagar",105,25000.00,"Male")));
		System.out.println(" contains "+e2+list.contains(e5));		
		System.out.println("  ");
		
		// get() size()
		for(int i =0 ; i<list.size();i++)
			System.out.println(list.get(i));
		
		
		// sort()
		Collections.sort(list);
		
		
		// get() size()
		System.out.println("Sorted");
		for(int i =0 ; i<list.size();i++)
			System.out.println(list.get(i));
		
		
		
		// addAll()
		
		ArrayList<Employee> list2 = new ArrayList<>();
		list2.add(new Employee("A",201,20000.00,"Female"));
		list2.add(new Employee("D",202,30000.00,"Male"));
		list2.add(new Employee("C",206,10000.00,"Female"));
		list2.add(new Employee("B",205,60000.00,"Male"));
		
		list.addAll(list2);
		
		for(int i =0 ; i<list.size();i++)
			System.out.println(list.get(i));
		
		// clear()
		list.clear();
		System.out.println("List is  "+list);
		
	}
	
}