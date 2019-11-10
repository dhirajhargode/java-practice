package com.lang.equals;

public class Student4 { // nullpointerexception

	String name;
	int rollno;

	public Student4(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public boolean equals(Object obj) { // class cast exception

		//point into same object
		if(this==obj)
			return true;
		
		
		if (obj instanceof Student4) {
			Student4 s = (Student4) obj; // convert obj into student
			if (name.equals(s.name) && rollno == s.rollno) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Student4 s1 = new Student4("Dhiraj", 101);
		Student4 s2 = new Student4("Sushil", 102);
		Student4 s3 = new Student4("Dhiraj", 101);
		Student4 s4 = s1;

		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // true
		System.out.println(s1.equals(null)); // nullpointer exception
		System.out.println(s1.equals("Dhiraj")); // ClassCastexception
	}

}
