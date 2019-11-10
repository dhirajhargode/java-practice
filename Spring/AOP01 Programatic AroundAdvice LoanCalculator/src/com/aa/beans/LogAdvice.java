package com.aa.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Object retVal = null;
		Object[] arr = mi.getArguments();
		if ((double) arr[0] >= 500000) {
			arr[2] = 1;
			retVal = mi.proceed();
		} else {
			retVal = mi.proceed();
		}

		return retVal;
	}

}
