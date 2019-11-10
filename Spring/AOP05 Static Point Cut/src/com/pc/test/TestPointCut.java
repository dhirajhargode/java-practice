package com.pc.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.pc.beans.WSAdvicer;
import com.pc.beans.WSStaticPointCut;
import com.pc.beans.WeatherStation;

public class TestPointCut {
	public static void main(String[] args) {

		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new WeatherStation());

		WSStaticPointCut wsp = new WSStaticPointCut();
		WSAdvicer wsad = new WSAdvicer();

		pf.addAdvisor(new DefaultPointcutAdvisor(wsp, wsad));
		// pf.addAdvice(new WSAdvicer());

		WeatherStation ws = (WeatherStation) pf.getProxy();
		System.out.println("Temperature is ::" + ws.getTemperature(565656));
		System.out.println("will Rain ? ::" + ws.willRainInAnHour(565656));

	}

}
