package com.gc.test;

 public class FinalizationCase2 {
	
	public static void main(String[] args) {
		
		String s1=new String("Durga");
		FinalizationCase1 s2=new FinalizationCase1();
		s2.finalize();
		s2.finalize();
		s2=null;
		System.gc();
		System.out.println("end of main");
		
	}
	public void finalize() {
		System.out.println("Finalized method called...");
	}

}
