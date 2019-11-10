package com.aa.beans;

import java.lang.invoke.MethodHandleInfo;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoring implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		
		
		long start = System.currentTimeMillis();
		
		// call business logic
		Object retVal = mi.proceed();

		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println("Time taken  : " + diff + " in ms");
		
		return retVal;
	}

}
