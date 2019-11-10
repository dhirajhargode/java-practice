package com.pns.beans;

public class Car {

	private Integer carId;
	private String carColor;
	private Engine eng;

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carColor=" + carColor + ", eng=" + eng + "]";
	}

}
