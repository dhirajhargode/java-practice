package com.lf.vararg;

public class Test {
	public static void main(String[] args) {

		sum();
		sum(10);
		sum(20, 10);
		sum(10, 20, 30);
	}

	public static void sum(int... x) {
		int total = 0;
		for (int i = 0; i < x.length; i++) {
			total = total + x[i];

		}
		System.out.println("sum is : " + total);
	}

}
