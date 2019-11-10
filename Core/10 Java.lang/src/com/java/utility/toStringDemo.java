package com.java.utility;

public class toStringDemo {

	// convert wrapper into toString

	public static void main(String[] args) {

		Integer i = new Integer(56);
		
		String i1 = i.toString();
		System.out.println(i1);
		
		System.out.println(i.toBinaryString(i));
		System.out.println(i.toOctalString(i));
		System.out.println(i.toHexString(i));
		
	}

}
