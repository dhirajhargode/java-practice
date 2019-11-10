package com.aa.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retVal, Method m, Object[] args, Object target) throws Throwable {
		System.out.println("Execution completed for  : " + m.getName());
		System.out.println("Target method returned : " + retVal);

		retVal = 20000.00d;
	}

}
