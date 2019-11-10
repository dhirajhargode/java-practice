package com.java.string.scp;

public class ConcatDemo {

	public static void main(String[] args) {

		String s1 = new String("Dhiraj");
		String s2 = s1.concat("Hargode");
		String s3 = s2.intern();
		System.out.println(s2 == s3); 
		
		/*String s4 = "DhirajHargode";
		System.out.println(s3 == s4);*/
	}

}
