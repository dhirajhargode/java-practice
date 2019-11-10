package com.java.StringClass.method;

public class Demo1 {
	public static void main(String[] args) {
		String s1 = new String("durga");
		String s2 = s1.toLowerCase();
		String s3 = s1.toUpperCase();

		// no changes replace with same object in heap
		System.out.println(s1 == s2);

		// changes in Runtime so new object create in heap
		System.out.println(s1 == s3);

		//new object created
		String s4 = s3.toLowerCase();
		System.out.println(s4 == s1);
	}

}
