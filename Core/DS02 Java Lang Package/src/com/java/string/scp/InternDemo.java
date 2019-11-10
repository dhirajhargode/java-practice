package com.java.string.scp;

public class InternDemo {

	public static void main(String[] args) {

		String s1 = new String("Dhiraj");
		String s2 = s1.concat("hargode");
		String s3 = s2.intern();
		String s4 = "Dhirajhargode";
		System.out.println(s3 == s4);

	}

}
