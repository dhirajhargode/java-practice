package com.cdac;

public class SingletonDemo {
	
	

	public static void main(String[] args) throws Exception {

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println("s1==s2 " + (s1 == s2));
		Singleton s3 = (Singleton) s1.clone();
		System.out.println(s3);
		System.out.println("s1==s3 " + (s1 == s3));
	}
}
