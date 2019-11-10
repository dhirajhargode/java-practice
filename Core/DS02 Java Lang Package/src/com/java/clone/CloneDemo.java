package com.java.clone;

public class CloneDemo implements Cloneable {

	int i = 10;
	int j = 20;

	public static void main(String[] args) throws CloneNotSupportedException {

		CloneDemo c1 = new CloneDemo();
		CloneDemo c2 = (CloneDemo) c1.clone();

		c2.i = 88;
		c2.j = 99;

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

		System.out.println(c1.i + "......." + c1.j);
		System.out.println(c2.i + "......." + c2.j);
	}

}
