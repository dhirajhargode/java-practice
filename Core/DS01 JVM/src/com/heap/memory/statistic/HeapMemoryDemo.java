package com.heap.memory.statistic;

public class HeapMemoryDemo {

	public static void main(String[] args) {

		double mb=1024*1024;
		
		Runtime r = Runtime.getRuntime();
		
		System.out.println("max memory "+r.maxMemory()/mb);
		System.out.println("Initial memory "+r.totalMemory()/mb);
		System.out.println("free memory "+r.freeMemory()/mb);
		System.out.println("consumed memory "+(r.totalMemory()-r.freeMemory())/mb);

	}

}
