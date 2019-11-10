package com.ba.beans;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class LogAdvice {

	public void log(JoinPoint jp) {
		System.out.println("Execution started for : " + jp.getSignature());
		System.out.println("Arguments : " + Arrays.toString(jp.getArgs()));
	}

}
