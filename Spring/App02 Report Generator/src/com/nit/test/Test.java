package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.ExcelReportGenerator;
import com.nit.beans.PdfReportGenerator;
import com.nit.beans.ReportGenerator;

public class Test {
	public static void main(String[] args) {

		FileSystemResource res = new FileSystemResource("src/com/nit/xml/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		ReportGenerator rg = factory.getBean("rg", ReportGenerator.class);
		rg.generateReport();
	}
}
