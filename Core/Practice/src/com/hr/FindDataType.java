package com.hr;

import java.util.Scanner;

public class FindDataType {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of data ypu want to enter");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter " + i + " Data");
			try {
				Long l = sc.nextLong();
				System.out.println("This data can be fitted in");
				if (l >= -128 && l <= 127) {
					System.out.println("*Byte");
				}
				if (l >= -Math.pow(2, 15) && l <= (Math.pow(2, 15) - 1)) {
					System.out.println("*Short");
				}
				if (l >= -Math.pow(2, 31) && l <= (Math.pow(2, 31) - 1)) {
					System.out.println("*int");
				}
				if (l >= -Math.pow(2, 31) && l <= (Math.pow(2, 31) - 1)) {
					System.out.println("*long");
				}
			} catch (Exception e) {
				System.out.println(sc.next()+"can't fitted in anywhere");
			}
		}

	}

}
