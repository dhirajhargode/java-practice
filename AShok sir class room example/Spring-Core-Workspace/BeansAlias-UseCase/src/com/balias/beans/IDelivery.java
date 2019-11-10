package com.balias.beans;

public interface IDelivery {

	public void deliverProduct(OrderInfo oInfo, 
			PersonInfo pInfo, ShippingAddress sAddr);
}
