package com.ws.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.ws.beans.WSDynamicPointcut;
import com.ws.beans.WeatherStation;
import com.ws.beans.WeatherStationAdvisor;

public class TestPointCut {

	public static void main(String[] args) {

		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new WeatherStation());

		WeatherStationAdvisor wsad = new WeatherStationAdvisor();
		// WeatherStationStaticPointcut wssp = new
		// WeatherStationStaticPointcut();
		WSDynamicPointcut wsdp = new WSDynamicPointcut();
		factory.addAdvisor(new DefaultPointcutAdvisor(wsdp, wsad));

		WeatherStation wstation = (WeatherStation) factory.getProxy();

		System.out.println("Temperature : " + wstation.getTemperature(3000));
		System.out.println("Will Rain ? : " + wstation.willRainInAnHour(5001));

	}

}
