package com.anno.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.anno.beans.Car;

@Configuration
public class AppConfig {

	@Bean
	@Scope("prototype")
	public Car createCar() {
		Car c = new Car();
		c.setId(101);
		c.setName("Audi");
		return c;

	}

}
