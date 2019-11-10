package com.java.StringClass.method;

public class dotequalDemo {
	public static void main(String[] args) {

		String s = "JAVA";
		
		//case is important
		System.out.println(s.equals("java"));

		//case not important
		System.out.println(s.equalsIgnoreCase("java"));

	}

}
