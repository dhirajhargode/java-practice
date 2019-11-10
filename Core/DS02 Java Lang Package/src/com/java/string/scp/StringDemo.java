package com.java.string.scp;

public class StringDemo {
	public static void main(String[] args) {

		String s1 = new String("Dhiraj Hargode");
		String s2 = new String("Dhiraj Hargode");
		System.out.println(s1 == s2);
		String s3 = "Dhiraj Hargode";
		System.out.println(s1 == s3);
		String s4 = "Dhiraj Hargode";
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
		String s5 = "Dhiraj " + "Hargode";
		System.out.println(s5 == s4);
		String s6 = "Dhiraj ";
		String s7 = s6 + "Hargode";
		System.out.println(s3 == s7);

		final String s8 = "Dhiraj ";
		String s9 = s8 + "Hargode";
		System.out.println(s3 == s9);

		System.out.println(s6 == s8);

	}

}
