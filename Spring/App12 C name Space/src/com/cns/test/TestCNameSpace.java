package com.cns.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cns.beans.Employee;

public class TestCNameSpace {
	
	public static void main(String[] args) {
		
		ClassPathResource res=new ClassPathResource("com/cns/cfg/appliaction-Context.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Employee emp=factory.getBean("employee",Employee.class);
		System.out.println(emp);
				
	}

}
