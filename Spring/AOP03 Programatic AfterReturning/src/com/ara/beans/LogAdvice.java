package com.ara.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object r, Method m, Object[] arg, Object obj) throws Throwable {
		String methodNnme = m.getName();
		System.out.println("Method name " + methodNnme);

	}

}
