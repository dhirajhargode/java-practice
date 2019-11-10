package com.hr;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value which you want to format");
		double payment = scanner.nextDouble();
		
		scanner.close();
		
		NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.US);
		String us = nf1.format(payment);
		
		NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = nf2.format(payment);
		
		NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = nf3.format(payment);
		
		/*Locale INDIA =new Locale("en","IN");   //RS
		NumberFormat nf4=NumberFormat.getCurrencyInstance(INDIA);
		String india = nf4.format(payment);*/
		
		Locale INDIA =new Locale("pa","IN");   //INR
		NumberFormat nf4=NumberFormat.getCurrencyInstance(INDIA);
		String india = nf4.format(payment);
		
		
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}

}
