
package com.lf.main;

public class Test1 {

	static public void main(String[] args) {
		// public
		/*
		 * access from anywhere
		 */

		// static
		/*
		 * without existig object jvm call this method
		 */

		// void
		/*
		 * main method cant return anything
		 */

		// main
		/*
		 * this is tha name which is configure inside jvm
		 */

		// String[] args
		/*
		 * cmd line argument
		 * 
		 */

		/*
		 * writing ways
		 * 
		 * public static synchronized final strictfp void main(String[] args)
		 * 
		 * public static void main(String...args)
		 * 
		 * static public void main(String[] args)
		 * 
		 */

		System.out.println("public static void main(String[] args) ");
		System.out.println("public static void main(String...args) ");
		System.out.println("public static void main(String []args) ");
		System.out.println("public static void main(String args[]) ");

	}

	public static void main(int[] args) {
		System.out.println("explicitly call this method");

	}

}
