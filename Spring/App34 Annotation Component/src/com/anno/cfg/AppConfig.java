package com.anno.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

import com.anno.beans.Car;
import com.anno.beans.Engine;

public class AppConfig {

	private Engine eng = null;

	@Bean()
	@DependsOn("eng")
	public Car createCar() {
		Car c = new Car();
		c.setId(101);
		c.setName("Audi");
		return c;
	}

	@Bean()
	public Engine createEng() {
		Engine e = new Engine();
		e.setEid(201);
		e.setEname("petrol");
		return e;
	}

}
