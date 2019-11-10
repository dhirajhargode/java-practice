package com.cda.beans;

public class Car {

	private Engine eng;

	public Car(Engine eng) {
		this.eng = eng;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Car [eng=" + eng + "]";
	}

}
