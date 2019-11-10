package com.lang.equals;

public class Student {

	String name;
	int rollno;

	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) {

		Student s1 = new Student("Dhiraj", 101);
		Student s2 = new Student("Sushil", 102);
		Student s3 = new Student("Dhiraj", 101);
		Student s4 = s1;

		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // false   object class compare object s1 and s3 and diff obj
		System.out.println(s1.equals(s4)); // true

	}

}
