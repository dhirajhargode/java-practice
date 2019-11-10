package com.aa.beans;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor {

	Map<String, Double> cache = new HashMap<String, Double>();

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Object[] args = mi.getArguments();
		String key = Arrays.toString(args);
		Double retVal = null;
		if (cache.containsKey(key)) {
			return cache.get(key);
		} else {
			retVal = (Double) mi.proceed();
			retVal = retVal - 1000.00;
			cache.put(key, retVal);
		}
		return retVal;
	}
}
