package com.lf.main;

class Parent {
	public static void main(String[] args) {
		System.out.println("main");
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}

	}

	class Child extends Parent {
		

	}

	
	// both time main method execute
}
