package com.aa.beans;

import org.aspectj.lang.JoinPoint;

public class LogAfterAdvice {

	public void log(JoinPoint jp, double retVal) throws Throwable {
		System.out.println("Execution completed for  : ");
		System.out.println("Target method returned : " + retVal);
	}
}
