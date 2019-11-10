package com.company.module.submodule;

import java.util.Scanner;

public class RotationalString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String option = "";

		do {
			System.out.println("Enter the first string:");
			String str1 = scn.nextLine();
			System.out.println("Enter the second string:");
			String str2 = scn.nextLine();
			rotationalString(str1, str2);
			System.out.println("Do you want to continue(Y/N)?");
			option = scn.nextLine();
		} while (option.equalsIgnoreCase("Y"));
	}

	private static void rotationalString(String str1, String str2) {
		boolean flag = false;
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int l1 = ch1.length;
		int l2 = ch2.length;

		if (l1 != l2)
			System.out.println("Strings are not rotational");

		else {
			for (int i = 0; i < l1; i++) {

				if (ch1[i] == ch2[(l2 - 1)-i] )
					flag = true;
				else
					flag = false;
			}

		}
		if (flag)
			System.out.println("String are rotational");
		else
			System.out.println("Strings are not rotational");
	}
}
