package com.nit.beans;

public class TravelAgent {
	
	private TourPlan tp;
	
	public TravelAgent() {
		System.out.println("Travel Agent 0 : param const");
	}

	public TravelAgent(TourPlan tp) {
		System.out.println("Travel agent 1 : param constructor");
		this.tp = tp;
	}

	@Override
	public String toString() {
		return "TravelAgent [tp=" + tp + "]";
	}
	
	
	
	
	
	

}
