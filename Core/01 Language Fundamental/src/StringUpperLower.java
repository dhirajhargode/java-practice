package com.company.module.submodule;

import java.util.Scanner;

public class StringUpperLower {

	static Scanner scn = new Scanner(System.in);
	static int count = 1;
	static int T;
	static String S;

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter a Number");
		T = scn.nextInt();
		scn.nextLine();
		if (T <= 1 || T >= 200)
			System.out.println("Enter number between 1-200");
		else {
			for (int i = 0; i < T; i++) {

				System.out.println("Enter String " + count++);
				S = scn.nextLine();
				boolean b = Character.isUpperCase(S.charAt(0));

				if (b)
					sb = sb.append("\n" + S.toUpperCase());
				else
					sb = sb.append("\n" + S.toLowerCase());

			}
			System.out.println(sb);

		}

		/*Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String s = sc.next();
			char c[] = s.toCharArray();
			if (c[0] >= 'a' && c[0] <= 'z')
				s = s.toLowerCase();
			else
				s = s.toUpperCase();
			System.out.println(s);
		}*/
	}

}
