package com.lang.tostring;

public class Test1 {
	public static void main(String[] args) {
		Test1 t1=new Test1();
		String t =t1.toString();
		
		System.out.println(t);
		System.out.println(t1.getClass().getName()+"@");
	}
}
