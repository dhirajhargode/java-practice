package com.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sb.service.HelloService;

@SpringBootApplication
public class SpringBootApp1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootApp1Application.class, args);
		HelloService service = ctx.getBean(HelloService.class);

		System.out.println(service.helloService());
	}
}
