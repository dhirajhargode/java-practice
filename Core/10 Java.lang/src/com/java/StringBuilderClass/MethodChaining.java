package com.java.StringBuilderClass;

public class MethodChaining {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("durga").append("software").insert(2, "xyz").reverse().delete(5, 7);
		System.out.println(sb);
	}

}
