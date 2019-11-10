package com.gc.test;

import java.util.Date;

public class RuntimeGCDemo {
	public static void main(String[] args) {
		
		
		Runtime r=Runtime.getRuntime();
		System.out.println("Total memory in heap"+r.totalMemory());
		
		System.out.println("Free memory in heap "+r.freeMemory());
		for(int i=0;i<10000;i++) {
			Date d=new Date();
			d=null;
		}
		System.out.println("Free memory in heap "+r.freeMemory());
		
	
		System.gc();
		System.out.println("Free memory in heap "+r.freeMemory());
	}

}
