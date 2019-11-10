package com.java.StringBufferClass;

public class setCharAtDemo {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("durga");
		sb.setCharAt(0, 'D');
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer("ashokkumar");
		sb1.setCharAt(8, 'A');
		System.out.println(sb1);
		
	}

}
