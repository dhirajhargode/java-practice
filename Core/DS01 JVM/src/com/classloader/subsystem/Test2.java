package com.classloader.subsystem;

public class Test2 {

	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student();
		
		Class c1=s1.getClass();
		Class c2=s2.getClass();
		
		//both are pointing to same class
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1==c2);
		
	}
}
