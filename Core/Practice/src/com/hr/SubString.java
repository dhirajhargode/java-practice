package com.hr;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubString {

	public static String getSmallestAndLargest(String s, int k) {
		
		String smallest = "";
		String largest = "";
		
		SortedSet<String> set = new TreeSet<>();
		
		for (int i = 0; i < s.length() - k; i++) {
			set.add(s.substring(i, i + k));
		}
		
		smallest = set.first();
		largest = set.last();

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
