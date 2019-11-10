package com.hr;

import java.util.Scanner;

public class NumberTable {
	// write a table for specific number

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number which table you want to write");
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
		}

	}

}
