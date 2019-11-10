package com.lang.hashcode;

public class toStringAndhashCode {

	int rollno;

	public toStringAndhashCode(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return rollno + "";
	}

	// not executed hashCode
	
	public int hashCode() {
		return rollno; // 0 ==> follow some algorith
	}			

	public static void main(String[] args) {

		Integer i = new Integer(10);
		System.out.println(i);

		toStringAndhashCode s = new toStringAndhashCode(110);
		System.out.println(s); // 110

		// we always want new hashCode()
		toStringAndhashCode s1 = new toStringAndhashCode(102);
		System.out.println(s1); // 102

	}

}
