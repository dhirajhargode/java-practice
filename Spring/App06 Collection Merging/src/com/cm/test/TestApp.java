package com.cm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cm.besns.Meeting;

public class TestApp {
	public static void main(String[] args) {

		ClassPathResource res = new ClassPathResource("com/cm/cfg/appplication-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
				
		Meeting m1 = factory.getBean("traigeCall", Meeting.class);
		System.out.println("Triage Call : "+m1);
		
		Meeting m2 = factory.getBean("standupCall", Meeting.class);
		System.out.println("standup Call "+m2);
		
		Meeting m3 = factory.getBean("weeklyCall", Meeting.class);
		System.out.println("weekly Call "+m3);
	}
}
