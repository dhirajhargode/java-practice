package com.hr;

import java.util.Scanner;

public class StdInOut {

	/*
	 * There are three lines of input:
	 * 
	 * The first line contains an integer. The second line contains a double. The
	 * third line contains a String.
	 * 
	 * There are three lines of output:
	 * 
	 * On the first line, print String: followed by the unaltered String read from
	 * stdin.
	 * 
	 * On the second line, print Double: followed by the unaltered double read from
	 * stdin.
	 * 
	 * On the third line, print Int: followed by the unaltered integer read from
	 * stdin.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer");
		Integer i = sc.nextInt();
		System.out.println("Enter Double");
		Double d = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter String");
		String s = sc.nextLine();

		System.out.println("String " + s);
		System.out.println("Double " + d);
		System.out.println("Integer " + i);
	}

}
