package com.cpe.beans;

public class Calculator {
	private Addition addition;

	public void setAddition(Addition addition) {
		this.addition = addition;
	}

	public void add() {
		System.out.println("Sum is : " + addition.add());
	}

}
