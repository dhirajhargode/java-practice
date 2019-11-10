package com.Objectclass.hashCode;

public class Test {

	String name;
	int i;

	public Test(String name, int i) {
		this.i = i;
		this.name = name;
	}

	public static void main(String[] args) {

		Test t1 = new Test("Dhiraj", 10);
		Test t2 = new Test("Sagar", 9);

		System.out.println(t1);
		System.out.println(t2);

	}

	@Override
	public int hashCode() {
		return name.hashCode() + i;
	}

}
