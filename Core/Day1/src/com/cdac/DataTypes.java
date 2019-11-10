package com.cdac;


class DataTypes {

	public static void main(String[] args) {

		// range of bytes is -128 to 127
		byte b1 = 127;

		// compile time error incompatible types ;
		//1. by default its int
		// byte b2 = 130 ;

		//2. type mismatch cannt convert string to byte
		// byte b4 = "Dhiraj" ;

		//3. 
		// typecast to byte
		byte b3 = (byte) 130; // ---> o/p = -126
		
		System.out.println(10/0.0);
		
		System.out.println(b3);

	}

}
