
// package
package com.lf.codingstandards;

//class
public class Calculate {

	// variable
	private int nouns;

	// boolean properties
	private boolean status;

	// boolean properties
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// constant
	public static final String query = "SELECT SNO,SNAME,ADD FROM STUDENT";

	// set and get method
	public void setNouns(String name) {
		this.nouns = nouns;
	}

	public int getNouns() {
		return nouns;
	}

	// method
	public static int sum(int number1, int number2) {
		return number1 + number2;

	}

	public static void main(String[] args) {

		int sum = sum(10, 20);
		System.out.println(sum);
	}

}
