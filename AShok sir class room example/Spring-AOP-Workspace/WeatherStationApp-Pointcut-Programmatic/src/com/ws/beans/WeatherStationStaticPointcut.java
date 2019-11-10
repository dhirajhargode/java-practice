package com.ws.beans;

import java.util.List;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class WeatherStationStaticPointcut extends StaticMethodMatcherPointcut {
	@Override
	public boolean matches(Method m, Class<?> cls) {
		if (m.getName().equals("getTemperature") && cls == WeatherStation.class) {
			return true;
		}
		return false;
	}
}
