package com.eevent.test;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEventHandler {

	public static void main(String[] args) {

		ConfigurableApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/eevent/cfg/application-Context.xml");
		cxt.start();
		cxt.stop();

	}

}
