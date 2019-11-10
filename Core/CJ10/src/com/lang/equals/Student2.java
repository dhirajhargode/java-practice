package com.lang.equals;

public class Student2{

	String name;
	int rollno;

	public Student2(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			String name1 = this.name;
			int rollno1 = this.rollno;

			Student2 s = (Student2) obj; // convert obj into student
			String name2 = s.name;
			int rollno2 = s.rollno;

			if (name1.equals(name2) && rollno2 == rollno1) {
				return true;
			} else {
				return false;
			}
		} // try
		catch (ClassCastException e) {
			return false;
		} // catch
	}

	public static void main(String[] args) {

		Student2 s1 = new Student2("Dhiraj", 101);
		Student2 s2 = new Student2("Sushil", 102);
		Student2 s3 = new Student2("Dhiraj", 101);
		Student2 s4 = s1;

		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // true
		System.out.println(s1.equals("Dhiraj"));
	}

}
