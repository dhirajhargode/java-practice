package com.java.clone.deep;

public class Dog implements Cloneable {

	Cat c;
	int i;

	public Dog(Cat c, int i) {
		this.c = c;
		this.i = i;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Cat c1 = new Cat(c.j);
		Dog d1 = new Dog(c1, i);
		return d1;
	}

}
