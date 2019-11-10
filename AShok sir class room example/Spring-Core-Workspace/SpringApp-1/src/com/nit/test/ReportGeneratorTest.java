package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nit.beans.ReportContext;

public class ReportGeneratorTest {

	public static void main(String[] args) throws Exception {
		ClassPathResource resource = new ClassPathResource("application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		ReportContext ctx1 = factory.getBean("reportCtx", ReportContext.class);
		// ctx.generateReport();
		ReportContext ctx2 = factory.getBean("reportCtx", ReportContext.class);

	}
}
