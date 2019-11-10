package com.lang.hashcode;

public class Student {

	int rollno;

	public Student(int rollno) {
		this.rollno = rollno;
	}

	public int hashCode() {
		return rollno; // 0 ==> follow some algorith
	}

	public static void main(String[] args) {

		Integer i = new Integer(10);
		System.out.println(i);

		Student s = new Student(110);
		System.out.println(s); // com.lang.hashcode.Student@11

		// we always want new hashCode()
		Student s1 = new Student(102);
		System.out.println(s1); // com.lang.hashcode.Student@12

	}

}
