package com.java.toString;

public class Test {
	
	public static void main(String[] args) {
		
		Test t=new Test();
		
		// internally call toString() 
		System.out.println("hash code for Test to represnt string :: "+t);
		
		String s=t.toString();
		
		System.out.println("toString to represent object :: "+s);
		
		
		
		
		
	}

}
