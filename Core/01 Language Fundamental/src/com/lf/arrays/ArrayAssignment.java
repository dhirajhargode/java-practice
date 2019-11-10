package com.lf.arrays;

public class ArrayAssignment {
	public static void main(String[] args) {
		
		Object[] a = new Object[10];
		a[0]=new Integer(10);
		System.out.println(a[0]);
		a[1]=new String("Dhiraj");
		System.out.println(a[1]);
		a[3]=new Object();
		System.out.println(a[3]);
		System.out.println(a[3]);
		
		
		// type required
		int[] x= {10,20,30,40,50};
		int[] y= {70,80};
		x=y;
		y=x;
		System.out.println(x[1]);
		
	}

}
