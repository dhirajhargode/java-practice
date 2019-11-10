package com.gc.test;

public class DemoFinalize {
	static int count;
	public static void main(String[] args) {
		
		for(int i=0;i<1000000;i++) {
			DemoFinalize t=new DemoFinalize();
			//t=null;
		}
		
	}
	public void finalize() {
		System.out.println("finalize method "+ ++count);
	}

}
