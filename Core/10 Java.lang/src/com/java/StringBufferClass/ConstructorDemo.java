package com.java.StringBufferClass;

public class ConstructorDemo {
	public static void main(String[] args) {
		
		// 1
		StringBuffer sb = new StringBuffer();
		sb.append("abcdefghijklmnop");
		System.out.println(sb.length());
		sb.append("a");
		sb.append("abcdefghijklmnop");
		sb.append("a");
		System.out.println(sb.length());
		sb.append("a");
		System.out.println(sb.capacity());
		
		// 2
		StringBuffer sb1=new StringBuffer(100);
		sb1.append("abcdefghijklmnopqrstuvwxyz");
		System.out.println(sb1.capacity());
		
		// 3
		StringBuffer sb2=new StringBuffer("durga");
		
		System.out.println(sb2.capacity());
	}

}
