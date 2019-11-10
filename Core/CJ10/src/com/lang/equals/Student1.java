package com.lang.equals;

public class Student1 {

	String name;
	int rollno;

	public Student1(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public boolean equals(Object obj) {		// class cast exception
		String name1 = this.name;
		int rollno1 = this.rollno;

		Student1 s = (Student1) obj; // convert obj into student
		String name2 = s.name;
		int rollno2 = s.rollno;

		if (name1.equals(name2) && rollno2 == rollno1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Student1 s1 = new Student1("Dhiraj", 101);
		Student1 s2 = new Student1("Sushil", 102);
		Student1 s3 = new Student1("Dhiraj", 101);
		Student1 s4 = s1;

		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // true
		System.out.println(s1.equals("Dhiraj"));   // classcast exception
	}

}
