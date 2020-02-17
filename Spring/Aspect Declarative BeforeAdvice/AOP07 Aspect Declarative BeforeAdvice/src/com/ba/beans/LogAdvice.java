package com.ba.beans;

import org.aspectj.lang.JoinPoint;

public class LogAdvice {

	public void Log(JoinPoint jp) {

		System.out.println("Execution Strat for :: " + jp.getSignature().getName());
		System.out.println("Parameters :: " + jp.getArgs());

	}

}