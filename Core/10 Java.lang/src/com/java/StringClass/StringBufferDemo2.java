package com.java.StringClass;

public class StringBufferDemo2 {
	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("dhiraj");
		StringBuffer sb2 = new StringBuffer("dhiraj");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
	}

}
