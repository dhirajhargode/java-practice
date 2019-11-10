package com.lang.equals;

public class Test1 {
	public static void main(String[] args) {

		String s1 = new String("Dhiraj");
		String s2 = new String("Dhiraj");
		System.out.println(s1 == s2); // diff obj ==== false
		System.out.println(s1.equals(s2)); // data same ===true

		System.out.println("==========================");

		StringBuffer sb1 = new StringBuffer("Sushil");
		StringBuffer sb2 = new StringBuffer("Sushil");
		System.out.println(sb1 == sb2); // false bz obj are diff
		// not contain equals method that obje class equal method execute and compare
		// object
		System.out.println(sb1.equals(sb2));

	}

}
