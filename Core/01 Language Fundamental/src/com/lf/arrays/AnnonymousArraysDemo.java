package com.lf.arrays;

public class AnnonymousArraysDemo {
	
	public static void main(String[] args) {
		
		System.out.println(sum(new int[] {10,20,30}));
		
		AnnonymousArraysDemo a=new AnnonymousArraysDemo();
		
		System.out.println(a.add(new int[] {10,20,30}));
		
	}
	
	public  int add(int[] x) {
		int total=0;
		for(int x1:x) {
			total+=x1;
		}
		return total;
	}

	public static int sum(int[] x) {
		int total=0;
		for(int x1:x) {
			total=total+x1;
		}
		return total;
				
	}

}
