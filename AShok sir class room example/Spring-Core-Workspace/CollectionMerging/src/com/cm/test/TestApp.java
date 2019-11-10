package com.cm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cm.beans.Meeting;

public class TestApp {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/cm/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Meeting weeklyMeeting = factory.getBean("weeklyMeeting", Meeting.class);
		System.out.println(weeklyMeeting);
	}
}
