package com.anno.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	private int id;
	private String name;
	
	@Autowired
	@Qualifier(value="petrol")
	private Engine eng;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", eng=" + eng + "]";
	}

}
