package com.bg.ar.beans;

import org.aspectj.lang.JoinPoint;

public class LogAfterAdvice {
	public void log(JoinPoint jp, double retval) {
		
		System.out.println("Method execution completed for : " + jp.getSignature().getName());
		
		//If bill amt > 5000 generate coupon
		if (retval > 5000.00) {
			// Generating coupon for Mobile number
			Object[] args = jp.getArgs();
			System.out.println("Coupon generated for : " + args[0]);
		}
	}
}
