package com.pc.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class WSAdvicer implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {

		System.out.println("Execution Start for " + mi.getMethod().getName());
		Object retVal = mi.proceed();
		System.out.println("Execution End for " + mi.getMethod().getName());

		return retVal;
	}

}
