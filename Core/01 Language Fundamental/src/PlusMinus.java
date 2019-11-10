package com.company.module.submodule;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

	static void plusMinus(int[] arr) {
		// Complete this function
		int k = arr.length;
		int a = 0;
		int b = 0;
		int c = 0;
		double x, y, z;
		for (int i = 0; i < k; i++) {
			if (arr[i] > 0)
				a++;
			else if (arr[i] < 0)
				b++;
			else
				c++;

		}
		System.out.println(x = (double) a / k);
		System.out.println(y = (double) b / k);
		System.out.println(z = (double) c / k);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		plusMinus(arr);
		in.close();
	}
}