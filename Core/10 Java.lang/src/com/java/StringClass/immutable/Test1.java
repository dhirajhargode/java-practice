package com.java.StringClass.immutable;

public class Test1 {

	public static void main(String[] args) {

		//immutable for object not for variable
		final StringBuffer sb = new StringBuffer("Durga");
		sb.append("software");
		System.out.println(sb);
	}

}
