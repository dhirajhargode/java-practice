package com.lf.arrays;

public class Array1 {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50,60};
		int[] b = {70,80};
		a = b;
		b = a;
		System.out.println(a[0] + " " + a[1]);
		System.out.println(b[0] + " " + b[1]);
	}
}
