package com.hr;

import java.util.Scanner;

public class SeriesPrint {
	/*
	 * Input Format
	 * 
	 * The first line contains an integer, q, denoting the number of queries. Each
	 * line i of the q subsequent lines contains three space-separated integers
	 * describing the respective ai,bi , and ni values for that query.
	 * 
	 * 
	 * Output Format
	 * 
	 * For each query, print the corresponding series on a new line. Each series
	 * must be printed in order as a single line of n space-separated integers.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no how many series you want to print ");
		int n = sc.nextInt();
		for (int j = 0; j < n; j++) {
		System.out.println("Enter Start at ");
		int a = sc.nextInt();
		System.out.println("Loop ");
		int b = sc.nextInt();
		System.out.println("print total no");
		int tn = sc.nextInt();

		int result = 0;
		result = a + result;

		for (int i = 0; i < tn; i++) {
			result = (result + (int) Math.pow(2, i) * b);
			System.out.print(result + " ");
		}
		System.out.println();
		}
		
	}

}
