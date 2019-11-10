package com.ta.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class LogAdvice implements ThrowsAdvice {

	public void afterThrowing(Exception e) {
		System.out.println("Exception occured :: sup " + e);
	}

	public void afterThrowing(Method m, Object[] args, Object t, NullPointerException npe) {
		System.out.println("Exception occured ::  " + m.getName());
		System.out.println("Parameter " + Arrays.toString(args));
		System.out.println("Exception detail ::" + npe);
	}

	public void afterThrowing(NullPointerException e) {
		System.out.println("Exception occured :: sub " + e);
	}

}
