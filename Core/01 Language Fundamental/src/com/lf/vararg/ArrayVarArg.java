package com.lf.vararg;

public class ArrayVarArg {
	public static void main(String[] args) {

		int[] l = { 10, 20, 30 };
		int[] m = { 40, 50, 60 };
		// methodOne(new int[] {10,20});
		methodOne(l, m);

	}

	public static void methodOne(int[]... x) {

		for (int[] a : x) {
			System.out.println(a[0] + ".." + a[1] + "..." + a[2]);
		}

	}

}
