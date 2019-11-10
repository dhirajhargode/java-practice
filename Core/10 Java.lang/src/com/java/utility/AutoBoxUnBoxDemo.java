package com.java.utility;

import java.lang.reflect.Method;

public class AutoBoxUnBoxDemo {

	public static void methodOne(int i) {
		System.out.println("Autounboxing");
	}

	public static void main(String[] args) {

		// primitive to wapper autoboxing
		Integer x = 20;

		// wapper to primitive
		methodOne(x);
	}

}
