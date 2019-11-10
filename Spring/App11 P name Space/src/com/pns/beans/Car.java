package com.pns.beans;

public class Car {
	
	private Integer carId;
	private String carColor;
	private Engine engine;
	
	
	public void setCarId(Integer carId) {
		this.carId = carId;
	}


	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public Car() {
		System.out.println("car 0 param cnstructor...");
	}


	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carColor=" + carColor + ", engine=" + engine + "]";
	}

	
}
