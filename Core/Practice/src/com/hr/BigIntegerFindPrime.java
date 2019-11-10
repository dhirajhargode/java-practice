package com.hr;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFindPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter integer");
		BigInteger n = sc.nextBigInteger();

		sc.close();
		String s =n.isProbablePrime(100) ? "prime" : "notPrime";
		System.out.println(s);

	}

}
