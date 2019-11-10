package com.nt.service;

import java.util.Calendar;

public class OrderApprover {

	public String apporoveOrder(int orderId) {

		Calendar c = Calendar.getInstance();

		int month = c.get(Calendar.MONTH);
		if (month >= 7 && month <= 10) {
			return orderId + " order is not Approved...";
		}

		return orderId + " order is Approved...";
	}// method

}// class
