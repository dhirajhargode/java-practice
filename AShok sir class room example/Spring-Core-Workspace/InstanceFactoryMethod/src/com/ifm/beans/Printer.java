package com.ifm.beans;

public class Printer {

	private Integer id;
	private String name;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Printer [id=" + id + ", name=" + name + "]";
	}

}
