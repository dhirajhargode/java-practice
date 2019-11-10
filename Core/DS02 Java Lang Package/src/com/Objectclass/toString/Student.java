package com.Objectclass.toString;

public class Student {

	private String name;
	private int rollNo;

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {

		Student s1 = new Student("Dhiraj", 101);
		Student s2 = new Student("Suraj", 102);

		System.out.println(s1);
		// System.out.println(s1.toString());
		System.out.println(s2);

	}

	@Override
	public String toString() {
		return name + "  " + rollNo;
	}

}
