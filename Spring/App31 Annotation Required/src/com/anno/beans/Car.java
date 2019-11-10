package com.anno.beans;

import org.springframework.beans.factory.annotation.Required;

public class Car {

	private int id;
	private String name;

	
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + "]";
	}

}
