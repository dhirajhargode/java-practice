package com.ara.beans;

import org.aspectj.lang.JoinPoint;

public class LogAfterReturningAdvice {
	
	
	public void log(JoinPoint jp,double retval) {
		System.out.println("Method Execution complate for "+jp.getSignature().getName());
		if(retval>5000) {
			Object[] args=jp.getArgs();
			System.out.println("Coupan generated for "+args[0]);
			
		}
	}

}
