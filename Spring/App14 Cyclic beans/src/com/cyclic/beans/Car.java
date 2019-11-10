package com.cyclic.beans;

public class Car {
	
	private Engine eng;
	
	public Car(Engine eng) {
		this.eng=eng;
	}
	
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	public Engine getEng() {
		return eng;
	}

	@Override
	public String toString() {
		return "Car [eng=" + eng + "]";
	}
	
	

}
