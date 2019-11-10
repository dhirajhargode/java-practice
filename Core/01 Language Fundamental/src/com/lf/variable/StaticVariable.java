package com.lf.variable;

public class StaticVariable {

	// static variable with default value
	private static int i1;

	// static variable with aasign value
	private static int i = 10;

	// boolean with default value
	private static boolean b;

	public static void main(String[] args) {

		InstanceVariable iv = new InstanceVariable();

		System.out.println(i); // 10
		System.out.println(i1); // 0

		// assign value to static varibale
		i1 = 11;
		System.out.println(i1); // 11
		System.out.println(b); // false

		// call static method from static method
		iv.methodOne();

	}

	// static method
	public static void methodOne() {
		// assign boolean b
		b = true;
		System.out.println("from m1 :: " + b);
	}

}
