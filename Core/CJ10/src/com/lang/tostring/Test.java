package com.lang.tostring;

public class Test {

	@Override
	public String toString() {
		return "our class toString override";
	}
	
	public static void main(String[] args) {
		Integer i=new Integer(10);    // internally to string override in all classes
		System.out.println(i);
		String s= new String("Dhiraj");	//// internally to string override
		System.out.println(s);
		
		Test t=new Test();
		System.out.println(t);
		
	}
	

}
