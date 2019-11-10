package com.Objectclass.equal;

public class Test {
	String name;

	public Test(String name) {
		name = this.name;
	}

	public static void main(String[] args) {
		Test t1 = new Test("Dhiraj");
		Test t2 = new Test("Dhiraj");
		System.out.println(t1.equals(t2));
		System.out.println(t1 == t2);
	}

}
