package com.Objectclass.equal;

public class Student {

	String name;
	int rollNo;

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {

		Student s1 = new Student("Sagar", 10);
		Student s2 = new Student("Sahil", 11);
		Student s3 = new Student("Sagar", 10);
		Student s4 = s1;

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

	}
}
