package com.company.module.submodule;

import java.util.Scanner;

public class ParenthesisStar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = scn.nextInt();

		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("(");
			}
			System.out.print("*");
			for (int k = 1; k <= i; k++) {
				System.out.print(")");
			}
			System.out.println();
		}
	}

}
