package com.java.StringBufferClass;

public class appendDem {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Pi value is : ");
		sb.append(3.14);
		sb.append(" this is exactly same ");
		sb.append(true);
		System.out.println(sb);
		
		
	}

}
