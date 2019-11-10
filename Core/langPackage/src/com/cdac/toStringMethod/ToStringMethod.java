package com.cdac.toStringMethod;


public class ToStringMethod {

	public static void main(String[] args) {

		Student s1 = new Student("Dhiraj", 11);
		Student s2 = new Student("Suraj", 12);

		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);

	}
	/*
	 * 
	 * this method is return in object class;
	 * 
	 * @Override public String toString() { return getClass().getName() + "@" +
	 * Integer.toHexString(hashCode()); }
	 */

}
