package com.baliase.beans;

import java.util.Set;

public class OrderInfo {
	
	public String orderNo;
	public double orderPrice;
	public Set<String> item;
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Set<String> getItem() {
		return item;
	}
	public void setItem(Set<String> item) {
		this.item = item;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	
	

}
