package com.classloader.subsystem;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws Exception {
		int count = 0;
		
		Student s=new Student();
		Class c = s.getClass();
	//	Class c1 = Class.forName("java.lang.String");
		Method[] m = c.getDeclaredMethods();   // reflect package

		for (Method m1 : m) {
			count++;
			System.out.println(m1);
		}
		System.out.println("No of methods are : "+count);

	}

}
