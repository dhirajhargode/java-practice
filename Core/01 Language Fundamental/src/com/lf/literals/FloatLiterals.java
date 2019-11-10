package com.lf.literals;

public class FloatLiterals {
	
	public static void main(String[] args) {
		
		float f1=(float) 123.456;
		float f2=123.456f;
		double d1=123.456;
		double d2=123.456D;
		
		float f3=0123.456f;
		double d3=0234.56;  // normal number not octal number
		System.out.println(d3);
		double d4=0xBeef;
	//	double d6=0xBe.ef;  // point not allowed in hexa 
	//	double d5=0x123.456; //not work
		System.out.println(d4);
		
		double d7=10e2; // 10*2 power
		float f4=10e4f;
		System.out.println(f4);
		
		
		
	}

}
