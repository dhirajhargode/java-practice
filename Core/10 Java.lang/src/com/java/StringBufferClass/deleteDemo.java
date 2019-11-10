package com.java.StringBufferClass;

public class deleteDemo {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("abcdefghij");
		sb.delete(2, 9);
		System.out.println(sb);
		sb.deleteCharAt(1);
		System.out.println(sb);
		
		
	}

}
