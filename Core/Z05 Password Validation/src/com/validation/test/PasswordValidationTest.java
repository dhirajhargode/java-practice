package com.validation.test;

import java.util.Scanner;

import com.validation.beans.PasswordValidation;

public class PasswordValidationTest {
	
	static PasswordValidation pv =new PasswordValidation();
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the password");
		
		String pw = sc.nextLine();
		pv.validate(pw);

		
		
	}

}
