package com.java.utility;

public class xxxValueDemo {
	// to convert wapper into primitive values

	public static void main(String[] args) {

		Integer i = new Integer(130);
		int a=i.byteValue();
		System.out.println(a);
		System.out.println(i.shortValue());
		System.out.println(i.intValue());
		System.out.println(i.doubleValue());
		System.out.println(i.floatValue());
		System.out.println(i.longValue());

		Character ch = new Character('a');
		System.out.println(ch.charValue());

		Boolean b = new Boolean("tRue");
		System.out.println(b.booleanValue());

	}

}
