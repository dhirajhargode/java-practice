package com.don.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.don.beans.CacheManager;
import com.don.beans.PersonalLoanEmiCalculator;

public class TestDependsOn {

	public static void main(String[] args) {

		Resource res = new ClassPathResource("com/don/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		PersonalLoanEmiCalculator emiCalc = 
				factory.getBean("emiCalc",PersonalLoanEmiCalculator.class);
		emiCalc.computeEmi("TCS", 600000.00, 36);

	}
}
