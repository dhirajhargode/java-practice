package com.nit.sb.apps.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String sayHello() {
		return "<h1>Hello World..!!</h1>";
	}

}
