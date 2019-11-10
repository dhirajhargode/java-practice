package com.lf.variable;

public class LocalVariable2 {

	public static void main(String[] args) {

		// for local variable we can use only final modifier.
		// thread safe

		final int x;
		if (args.length > 0) {
			x = 10;
			System.out.println(x);
		}
		// CE x not assigned
		// System.out.println(x);

		else {
			x = 20;
			System.out.println(x);
		}
		// here we can access x
		System.out.println(x);

		// cant change the value of final variable
		// x=30;

		LocalVariable2 lv = new LocalVariable2();
		lv.m1();

	}

	public void m1() {
		int y = 888;
		System.out.println(y);

	}

}
