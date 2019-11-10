package com.java.StringBufferClass;

public class ensureCapacityDemo {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.ensureCapacity(1000);
		System.out.println(sb.capacity());
		
	}

}
