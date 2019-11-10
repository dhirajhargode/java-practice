package com.don.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.don.beans.CacheManager;
import com.don.beans.PersnalLoanEMICompute;

public class TestAppDemandOn {
	public static void main(String[] args) {

		ClassPathResource res = new ClassPathResource("com/don/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		PersnalLoanEMICompute compute = factory.getBean("plec", PersnalLoanEMICompute.class);
		compute.calculateEMI("IBM", 600000.00, 36);
	}

}
