package com.ba.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class LogAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method m, Object[] args, Object obj) throws Throwable {
		System.out.println("Execution started for : " + m.getName());
		System.out.println("Method args : " + Arrays.toString(args));
		// changing target method parameters
		args[1] = "ORCL12345";
	}
}
