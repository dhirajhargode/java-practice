package com.java.StringBufferClass;

public class insertDemo {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("abcdef");
		sb.insert(2,"xyz");
		System.out.println(sb);
	}

}
