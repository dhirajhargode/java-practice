package com.pc.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;
import org.springframework.aop.support.StaticMethodMatcher;

public class WSSDynamicPointCut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method m, Class<?> cls, Object... arg) {
		if (m.getName().equals("getTemperature") && cls == WeatherStation.class && (int) arg[0] > 5000) {
			return true;
		}
		return false;
	}

}
