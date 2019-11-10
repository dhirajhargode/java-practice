package com.lang.equals;

public class Student3 {   // nullpointerexception

	String name;
	int rollno;

	public Student3(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public boolean equals(Object obj) { // class cast exception
		try {
			/*String name1 = this.name;
			int rollno1 = this.rollno;*/		// no need 

			Student3 s = (Student3) obj; // convert obj into student
			String name2 = s.name;
			int rollno2 = s.rollno;

			if (name.equals(name2) && rollno == rollno2) {
				return true;
			} else {
				return false;
			}
		} catch (ClassCastException cce) {
			return false;
		} catch (NullPointerException cce) {
			return false;
		}
	}

	public static void main(String[] args) {

		Student3 s1 = new Student3("Dhiraj", 101);
		Student3 s2 = new Student3("Sushil", 102);
		Student3 s3 = new Student3("Dhiraj", 101);
		Student3 s4 = s1;

		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // true
		System.out.println(s1.equals(null)); // nullpointer exception
	}

}
