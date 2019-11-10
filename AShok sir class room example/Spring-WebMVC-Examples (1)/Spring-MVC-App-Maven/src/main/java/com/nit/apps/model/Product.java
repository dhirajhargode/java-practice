package com.nit.apps.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Product {

	@NotEmpty(message = "Please Enter Product Id")
	private Integer pid;
	@NotEmpty(message = "Please Enter Product Name")
	private String pname;
	@NotEmpty(message = "Please Enter Product Price")
	private Double price;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
