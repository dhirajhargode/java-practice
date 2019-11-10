package com.java.toString;

public class Student {

	String name;
	Integer rollno;

	public Student(String name, Integer rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	/*
	 * public String toString() { 
	 * return getClass().getName() + "@" + Integer.toHexString(hashCode()); 
	 * }
	 */

	public static void main(String[] args) {

		Student s1 = new Student("Dhiraj", 1);
		Student s2 = new Student("Roshan", 2);

		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s2.toString());

	}

}
