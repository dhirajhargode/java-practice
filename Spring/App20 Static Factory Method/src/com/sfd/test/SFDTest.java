package com.sfd.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sfd.beans.Alarm;

public class SFDTest {
	public static void main(String[] args) {
		
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("com/sfd/cfg/application-Context.xml"));
		Alarm a =factory.getBean("alarm",Alarm.class);
		a.ring();
		//System.out.println(a);
	}

}
