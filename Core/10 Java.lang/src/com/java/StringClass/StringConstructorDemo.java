package com.java.StringClass;

public class StringConstructorDemo {

	public static void main(String[] args) {

		// creates an empty string object
		String s1 = new String();

		// create a string obj in heap for given string lateral
		String s2 = new String("Dhiraj");

		// create an equivalent string object for given string buffer
		StringBuffer sb = new StringBuffer("Hargode");
		String s3 = new String(sb);

		// create an equivalent string object for given char array
		char[] ch = { 'a', 'b', 'c', 'd' };
		String s4 = new String(ch);
		System.out.println(s4);

		byte[] b = { 101, 102, 103 };
		String s5 = new String(b);
		System.out.println(s5); // efg

	}

}
