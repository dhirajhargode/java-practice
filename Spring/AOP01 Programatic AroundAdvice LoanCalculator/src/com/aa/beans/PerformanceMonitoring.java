package com.aa.beans;

import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoring implements org.aopalliance.intercept.MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {

		long start = System.currentTimeMillis();

		// B.L.
		Object retVal = mi.proceed();

		long end = System.currentTimeMillis();

		long diff = end - start;
		System.out.println("Time is " + diff + "in ms.");
		return retVal;
	}

}
