package com.bt.ad.beans;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoring {
	public Object monitor(ProceedingJoinPoint pjp) {
		long start = System.currentTimeMillis();
		Object retVal = null;
		try {
			retVal = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		String methodName = pjp.getSignature().getName();
		System.out.println("Time taken for : " +
					methodName + " : " + (end - start));
		return retVal;
	}

}
