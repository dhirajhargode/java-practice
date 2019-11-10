package com.string;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubStringDemo {
	public static void main(String[] args) {

		System.out.println("Enter String :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Enter No to Sort");
		int k = sc.nextInt();

		getSmallAndLarge(s, k);

		sc.close();

	}

	public static void getSmallAndLarge(String s, int k) {
		SortedSet<String> sets = new TreeSet<String>();
		for (int i = 0; i <= s.length() - k; i++) {
			sets.add(s.substring(i, i + k));

		}

		System.out.println(sets.first());
		System.out.println(sets.last());

	}

}
