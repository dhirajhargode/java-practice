package com.pc.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcher;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class WSStaticPointCut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method m, Class<?> cls) {
		if (m.getName().equals("getTemperature") && cls == WeatherStation.class) {
			return true;
		}
		return false;
	}

}
