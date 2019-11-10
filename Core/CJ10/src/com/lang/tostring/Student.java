package com.lang.tostring;

public class Student {
	String name;
	int rollno;
	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	
	public static void main(String[] args) {
		Student s1=new Student("Dhiraj",101);
		Student s2=new Student("Sushil",102);
		
		System.out.println(s1);
		System.out.println(s1.toString());  // object class toString method
		System.out.println(s2);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
	
	
	

}
