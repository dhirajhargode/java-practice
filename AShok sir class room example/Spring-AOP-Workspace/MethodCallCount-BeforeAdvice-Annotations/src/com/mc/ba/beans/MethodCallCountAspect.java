package com.mc.ba.beans;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MethodCallCountAspect {

	@Pointcut("execution(* com.mc.ba.beans.*.*(..))")
	public void methodPointCut() {

	}

	@Before("methodPointCut()")
	public void monitor(JoinPoint jp) {
		Signature sig = jp.getSignature();
		String methodName = sig.getName();
		Monitor.increment(methodName);
	}

	@Around("methodPointCut()")
	public Object log(ProceedingJoinPoint pjp) {
		Object retVal = null;
		try {
			System.out.println("before");
			retVal = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("after");
		return retVal;
	}
}
