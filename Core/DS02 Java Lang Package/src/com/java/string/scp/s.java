package com.java.string.scp;

class s {

	public static void main(String[] args) {

		String s1 = new String("dhoni");
		String s2 = s1.concat("virat");
		String s3 = s2.intern();
		System.out.println(s2 == s3);
	}

}
