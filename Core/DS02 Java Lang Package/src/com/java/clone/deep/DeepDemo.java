package com.java.clone.deep;

public class DeepDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Cat c = new Cat(20);
		Dog d1 = new Dog(c, 10);

		System.out.println(d1.i + "------" + d1.c.j);

		Dog d2 = (Dog) d1.clone();

		d1.i = 888;
		d1.c.j = 999;
		System.out.println(d2.i + "------" + d2.c.j);

	}

}
