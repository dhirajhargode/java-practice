package com.ws.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class WSDynamicPointcut extends DynamicMethodMatcherPointcut {
	@Override
	public boolean matches(Method m, Class<?> cls, Object... args) {

		if (m.getName().equals("getTemperature") && cls == WeatherStation.class && (int) args[0] >= 5000) {
			return true;
		}
		return false;
	}
}
