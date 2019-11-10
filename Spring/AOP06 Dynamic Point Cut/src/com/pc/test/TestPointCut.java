package com.pc.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.pc.beans.WSAdvicer;
import com.pc.beans.WSSDynamicPointCut;
import com.pc.beans.WeatherStation;

public class TestPointCut {
	public static void main(String[] args) {

		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new WeatherStation());
	
		WSSDynamicPointCut wsdp=new WSSDynamicPointCut();
		WSAdvicer wsad=new WSAdvicer();
		
		pf.addAdvisor(new DefaultPointcutAdvisor(wsdp,wsad));
		//	pf.addAdvice(new WSAdvicer());

		WeatherStation ws = (WeatherStation) pf.getProxy();
		System.out.println("Temperature is ::" + ws.getTemperature(565));
		System.out.println("will Rain ? ::" + ws.willRainInAnHour(565656));

	}

}
