package com.company.module.submodule;

import java.util.Scanner;

public class EachWordMatch {
	public static void main(String[] args) {
		// code
		Scanner scn = new Scanner(System.in);
		int T=scn.nextInt();scn.nextLine();
		boolean b = false;
		while(T-->0) {
		String s = scn.nextLine();
		int len = s.length();
		char ch = s.charAt(0);
		for (int i = 0; i < len; i++) {
			if (ch != s.charAt(i)) {
				b = false;
			} else
				b = true;
			
		}
		if (b)
			System.out.println("YES");

		else
			System.out.println("NO");
	}
	}
}
