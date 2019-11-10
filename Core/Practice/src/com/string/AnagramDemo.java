package com.string;

import java.util.Scanner;

public class AnagramDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String a = sc.nextLine();
		System.out.println("Enter 2st String");
		String b = sc.nextLine();

		isAnagram(a, b);

		sc.close();

	}

	private static void isAnagram(String a, String b) {

		System.out.println(a.equalsIgnoreCase(b));

	}

}
