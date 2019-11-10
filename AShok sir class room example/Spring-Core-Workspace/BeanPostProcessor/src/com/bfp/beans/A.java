package com.bfp.beans;

public class A {

	private int i;
	private int j;

	public int getI() {
		System.out.println("getter method");
		return i;
	}

	public void setI(int i) {
		System.out.println("setter method");
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}

}
