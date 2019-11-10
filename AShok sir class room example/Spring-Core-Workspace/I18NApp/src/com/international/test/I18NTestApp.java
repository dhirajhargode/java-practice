package com.international.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18NTestApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/international/cfg/application-Context.xml");
		Locale locale = new Locale("hi", "IN");
		String msg = context.getMessage("abc", new Object[] { "Raju" }, Locale.CHINA);
		System.out.println(msg);
	}

}
