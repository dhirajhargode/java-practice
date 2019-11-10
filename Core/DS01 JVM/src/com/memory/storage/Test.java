package com.memory.storage;

import com.classloader.subsystem.Student;

public class Test {
	
	Student s1=new Student();
	static Student s2=new Student();
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("unused")
		Test t=new Test();
		
		
		@SuppressWarnings("unused")
		Student s3=new Student();
		
	}
	

}
