package com.bi.beans;

public class Mobile {

	private Integer mobileId;
	private String name;
	private String color;
	private Double price;
	private String imeiNo;

	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setImeiNo(String imeiNo) {
		this.imeiNo = imeiNo;
	}

	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", name=" + name + ", color=" + color + ", price=" + price + ", imeiNo="
				+ imeiNo + "]";
	}

}
