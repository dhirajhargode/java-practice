package com.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mr.beans.ReportGenerator;

public class TestMethodReplacement {
	
	public static void main(String[] args) {
		
		BeanFactory factory  =new XmlBeanFactory(new ClassPathResource("com/mr/cfg/application-Context.xml"));
		ReportGenerator rg = factory.getBean("rg",ReportGenerator.class);
		rg.generate(442011);
		System.out.println("=====================");
		rg.generate();
	}

}
