package com.cdac.toStringMethod;

class Student {

	String name;
	int no;

	public Student(String name, int no) {

		this.name = name;
		this.no = no;

	}

	@Override
	public String toString() {
		return "" + name + " " + no + "";
	}

}