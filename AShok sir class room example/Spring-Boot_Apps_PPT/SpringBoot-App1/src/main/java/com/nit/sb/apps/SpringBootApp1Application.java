package com.nit.sb.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.sb.apps.service.HelloService;

@SpringBootApplication
public class SpringBootApp1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootApp1Application.class, args);
		HelloService service = context.getBean(HelloService.class);
		System.out.println(service.sayHello());
	}
}
