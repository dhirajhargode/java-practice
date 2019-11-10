package com.java.utility;

public class valueOfDemo {
	// convert STring and primitive into wapper classes
	
	public static void main(String[] args) {

		Integer i = new Integer(10);

		Integer i1 = Integer.valueOf("10");
		Integer i2 = Integer.valueOf(10);

		System.out.println(i.equals(i1));
		System.out.println(i.equals(i2));

		Integer i3 = Integer.valueOf("101", 2);
		Integer i4 = Integer.valueOf("67", 8);
		Integer i5 = Integer.valueOf("90af", 16);
		Integer i6 = Integer.valueOf("101", 36);

		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);

	}

}
