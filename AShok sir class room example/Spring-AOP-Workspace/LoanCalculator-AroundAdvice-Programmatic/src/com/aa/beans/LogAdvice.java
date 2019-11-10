package com.aa.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		String methodName = mi.getMethod().getName();
	
		System.out.println("Execution started for : " + methodName);

		//Getting target method arguments
		Object[] args = mi.getArguments();
		
		if((double)args[0]>=500000.00){
			args[2] = 1.0;
		}
		
		Object retVal = mi.proceed();

		System.out.println("Execution ended for :" + methodName);

		return retVal;
	}

}
