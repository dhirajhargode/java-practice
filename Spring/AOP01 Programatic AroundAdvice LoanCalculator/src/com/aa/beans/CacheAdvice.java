package com.aa.beans;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor {

	Map<String, Object> cache = new HashMap<String, Object>();

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Object[] arr = mi.getArguments();
		String key = Arrays.toString(arr);
		Object retVal = null;

		if (cache.containsKey(key)) {
			return cache.get(key);
		} else {

			retVal = (Double) mi.proceed();
			cache.put(key, retVal);
			retVal = (double) retVal - 1000.00;
		}
		return retVal;
	}

}
