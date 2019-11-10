package com.Objectclass;

import java.lang.reflect.Method;

public class Methods {
	public static void main(String[] args) throws Exception {

		int count = 0;
		Class c = Class.forName("java.lang.Object");
		Method[] m = c.getDeclaredMethods();
		for (Method m1 : m) {
			count++;
			System.out.println(m1);
		}
		System.out.println(count);

	}

}
