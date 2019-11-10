package com.ba.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class LogAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] arg, Object t) throws Throwable {

		System.out.println("object Only see " + t);
		System.out.println("Execution start for ::" + m.getName());
		System.out.println("Args :: " + Arrays.toString(arg));
		arg[1] = "oracle1234";
		System.out.println("ID :: " + arg[1]);
		System.out.println("Execution End for ::" + m.getName());

	}

}
