package com.anno.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

public class Car {

	@PostConstruct
	public void start() {
		System.out.println("Started....");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("stoped....");
	}

}
