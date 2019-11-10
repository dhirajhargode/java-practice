package com.ws.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class WeatherStationAdvisor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		String methodName = mi.getMethod().getName();
		System.out.println("Execution started for :" + methodName);

		Object retVal = mi.proceed();

		System.out.println("Execution ended for :" + methodName);
		return retVal;
	}
}
