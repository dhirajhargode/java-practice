package com.java.clone.shallow;

public class Dog implements Cloneable {

	int i = 10;

	Cat c;

	public Dog(int i, Cat c) {
		this.i = i;
		this.c = c;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
