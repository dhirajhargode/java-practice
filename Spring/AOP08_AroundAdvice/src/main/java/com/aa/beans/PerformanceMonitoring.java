package com.aa.beans;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoring {
	
	public Object monitor(ProceedingJoinPoint pjp) throws Throwable {
		long start =System.currentTimeMillis();
		System.out.println("Before");
		Object retVal = pjp.proceed();
		System.out.println("after");
		long end =System.currentTimeMillis();
		String methodname=pjp.getSignature().getName();
		System.out.println("Time taken for "+methodname +" : "+(end-start));
		return retVal;
		
	}
}
