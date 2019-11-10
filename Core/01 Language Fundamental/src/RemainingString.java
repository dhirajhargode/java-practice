package com.company.module.submodule;

import java.util.Scanner;

public class RemainingString {
	static int count;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int t = scn.nextInt();
		scn.nextLine();
		while (t-- > 0) {
			System.out.println("Enter a String");
			String s = scn.nextLine();
			System.out.println("Enter a char you want to search");
			String ch = scn.nextLine();
			System.out.println("Enter a Number");
			int k = scn.nextInt();
			if (k == 0)
				System.out.println(s);
			scn.nextLine();
			int len = s.length();
			int l = 0;
			int c = 0;
			for (int i = 0; i < len; i++) {
				int f = s.indexOf(ch, l);
				if (f == -1 || f == len - 1) {
					System.out.println("empty");
					break;
					
				}
				l = f + 1;
				c++;
				if (c == k) {
					System.out.println(s.substring(l));
					break;
				}
			}
		}
	}

}
