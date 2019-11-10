package com.lf.literals;

public class charLiterals {
	
	public static void main(String[] args) {
		
		char ch1='a';
		System.out.println(ch1);
		
		char ch2=65535;
		System.out.println("Range :: "+(2*Math.pow(2, 15)-1));
		System.out.println(ch2);
		
		char ch5=0123;
		System.out.println(ch5);
			
		char ch3 =0xbeef;
		System.out.println(ch3);
		
		char ch4='\u0061';     // 4 digit hexa number '\ u'==>unicode
		System.out.println(ch4);
		
	}

}
