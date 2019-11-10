package com.company.module.submodule;

import java.util.Scanner;

public class StringReverseRecursion {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scn.nextLine();
		stringReversor(str);

	}

	public static void stringReversor(String str) {
int n=str.length()-1;
		if (n <= 0)
			System.out.println(str);

		else {
			System.out.print(str.charAt(n));
			stringReversor(str.substring(0, n));
		}

	}
}