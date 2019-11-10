package com.bi.beans;

public class Moblie {

	private Integer mobileId;
	private String imeiNum;
	private String mobileName;
	private String color;
	private double price;

	
	
	
	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}




	public void setImeiNum(String imeiNum) {
		this.imeiNum = imeiNum;
	}




	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	@Override
	public String toString() {
		return "Moblie [mobileId=" + mobileId + ", imeiNum=" + imeiNum + ", mobileName=" + mobileName + ", color="
				+ color + ", price=" + price + "]";
	}

	
	

}
