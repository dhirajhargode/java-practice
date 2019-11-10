package com.Objectclass.equal;

public class EqualDemo {

	String name;
	int rollno;

	public EqualDemo(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj instanceof EqualDemo) {
			try {
				EqualDemo e = (EqualDemo) obj;

				if (name.equals(e.name) && rollno == e.rollno) {
					return true;
				} else
					return false;
			} catch (ClassCastException cce) {
				return false;

			} catch (NullPointerException e) {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		EqualDemo e1 = new EqualDemo("roshan", 1);
		EqualDemo e2 = new EqualDemo("Dhiraj", 2);
		EqualDemo e3 = new EqualDemo("roshan", 1);
		EqualDemo e4 = e1;

		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode() == e2.hashCode());
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
		System.out.println(e1.equals("Dhiraj"));
		System.out.println(e1.equals(null));

	}

	@Override
	public String toString() {
		return "EqualDemo [name=" + name + ", rollno=" + rollno + "]";
	}

}