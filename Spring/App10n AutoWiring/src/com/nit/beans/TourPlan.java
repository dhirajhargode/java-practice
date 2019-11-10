package com.nit.beans;

import java.util.Arrays;

public class TourPlan {
	
	private String[] places;

	
	public void setPlaces(String[] places) {
		this.places = places;
	}

	public String[] getPlaces() {
		return places;
	}

	@Override
	public String toString() {
		return "TourPlan [places=" + Arrays.toString(places) + "]";
	}
	
	

}
