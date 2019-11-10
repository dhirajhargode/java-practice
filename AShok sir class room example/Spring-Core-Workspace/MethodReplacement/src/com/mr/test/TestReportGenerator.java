package com.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.mr.beans.ReportGenerator;

public class TestReportGenerator {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("com/mr/cfg/application-context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		ReportGenerator rg = factory.getBean("rg", ReportGenerator.class);
		rg.generate(500068);
		System.out.println("=================");
		rg.generate();

	}

}
