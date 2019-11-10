package com.sfm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sfm.beans.Alarm;

public class SFMTest {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/sfm/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Alarm a = factory.getBean("a", Alarm.class);
		a.ring();
	}
}
