package com.java.StringBufferClass;

public class trimToSizeDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(1000);
		System.out.println(sb.capacity());
		sb.append("abc");
		sb.trimToSize();
		System.out.println(sb.capacity());
	}

}
