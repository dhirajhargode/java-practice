package com.i18l.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18LTest {
	
	public static void main(String[] args) {
		ApplicationContext cxt =new ClassPathXmlApplicationContext("com/i18l/cfg/application-Context.xml");
		
		Locale locale =new Locale("hi","IN");
		
		String msg =cxt.getMessage("hello", new Object[] {"Raj"}, locale);
		String msg3 =cxt.getMessage("hello", new Object[] {"Raj"}, Locale.CANADA);
		String msg1 =cxt.getMessage("hello", new Object[] {"Raj"}, Locale.CHINA);
		String msg2 =cxt.getMessage("hello", new Object[] {"Raj"}, Locale.US);
		
		System.out.println(msg);
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
	}

}
