package com.lf.variable;

public class LocalVariable {

	public static void main(String[] args) {

		// always assign local variable value
		int i = 10;

		// GC if not assign
		int l;

		for (int j = 0; j <= i; j++) {
			j = i + j;
			System.out.println("i :" + i + "---- j :" + j);
		}
		// System.out.println(i+"----"+j);
		// outside loop we cant use j variable local variable cant find j symbol
	}

}
