package com.bfp.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String name) throws BeansException {
		System.out.println(obj);
		System.out.println("After Initialization");
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String name) throws BeansException {
		System.out.println(obj);
		System.out.println("Before Initializataion");
		return obj;
	}
}
