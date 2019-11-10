package com.java.getClass;

import java.lang.reflect.Method;

public class GetClassDemo {

	public static void main(String[] args) {

		Object o = new String("Ashok");
		Class c = o.getClass();
		Method[] ms = c.getDeclaredMethods();

		// System.out.println(o.getClass());
		System.out.println(c.getName());
		for (Method m : ms) {
			// System.out.println(m);
			System.out.println(m.getName());
		}
	}

}
