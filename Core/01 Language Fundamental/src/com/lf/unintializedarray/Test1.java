package com.lf.unintializedarray;

public class Test1 {

	// instance-refrence variable
	int[] x;
	int[] y = new int[3];

	// static-refrence variable
	static int[] a;
	static int[] b = new int[3];

	public static void main(String[] args) {

		Test1 t = new Test1();

		System.out.println(t.x); // null
		// System.out.println(t.x[0]); // RE : NullpointerException
		System.out.println(t.y); // [I@115asd5as1 hashcode
		System.out.println(t.y[0]); // 0

		System.out.println("--------------");

		System.out.println(a); // null
		// System.out.println(t.a[0]); // RE : NullpointerException
		System.out.println(b); // [I@115asd5as1 hashcode
		System.out.println(b[0]); // 0

		System.out.println("============");
		int[] m;
		int[] n = new int[3];

		// System.out.println(m); // not initialized
		// System.out.println(t.n[0]); // not initialized
		// System.out.println(m); // not initialized
		System.out.println(n[0]); // 0

	}

}
