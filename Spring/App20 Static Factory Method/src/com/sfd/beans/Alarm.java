package com.sfd.beans;

import java.util.Calendar;

public class Alarm {
	
	private Calendar cal;

	public void setCal(Calendar cal) {
		this.cal = cal;
	}
	
	
	public void ring() {
		System.out.println(" Time is : "+cal.getTime());
		System.out.println("ring ring.....");
	}

	@Override
	public String toString() {
		return "Alarm [cal=" + cal + "]";
	}
	
	
	
	

}
