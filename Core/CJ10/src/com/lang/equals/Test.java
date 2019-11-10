package com.lang.equals;

public class Test {

	int rollno;

	public Test(int rollno) {
		this.rollno = rollno;
	}

	public static void main(String[] args) {

		String s1 = new String("Dhiraj");
		String s2 = new String("Dhiraj");
		StringBuffer sb1 = new StringBuffer("Dhiraj");
		StringBuffer sb2 = new StringBuffer("Dhiraj");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		// System.out.println(s1==sb1); // not same type
		System.out.println(s1.equals(sb2));
		
		System.out.println("======================");
		Test t1 = new Test(10);
		Test t2 = new Test(10);
		System.out.println(t1.equals(t2));
		System.out.println(t2);
		System.out.println(t1);

	}
	@Override
	public boolean equals(Object obj) { // class cast exception

		//point into same object
		if(this==obj)
			return true;
		
		
		if (obj instanceof Test) {
			Test s = (Test) obj; // convert obj into student
			if (rollno == s.rollno) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	
	@Override
	public String toString() {
		return rollno+"";
	}

	@Override
	public int hashCode() {
		return rollno;
	}
}
