package com.lf.identifier;

public class DataTypeRange {
	
	public static void main(String[] args) {
		
		byte b1= 127;
		byte b2= -128;
		
		short s1=-32768;
		short s2=32767;
		
		int i1=-2147483648;
		int i2=2147483647;
		
		System.out.println("byte range min is :: "+ - Math.pow(2, 7) + " max is : "+ (Math.pow(2, 7)-1));
		System.out.println("short range min is :: "+ - Math.pow(2, 15) + " max is : "+ (Math.pow(2, 15)-1));
		System.out.println("int range min is :: "+ - Math.pow(2, 31) + " max is : "+ (Math.pow(2, 31)-1));
		System.out.println("long range min is :: "+ - Math.pow(2, 63) + " max is : "+ (Math.pow(2, 63)-1));
		
		
		
		
	}

}
