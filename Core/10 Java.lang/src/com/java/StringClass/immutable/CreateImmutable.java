package com.java.StringClass.immutable;

final public class CreateImmutable {

	private int i;

	public CreateImmutable(int i) {
		this.i = i;
	}

	public CreateImmutable modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return (new CreateImmutable(i));
		}

	}

	public static void main(String[] args) {

		CreateImmutable ci1 = new CreateImmutable(10);
		CreateImmutable ci2 = ci1.modify(100);
		CreateImmutable ci3 = ci1.modify(10);

		System.out.println(ci1 == ci2);
		System.out.println(ci1 == ci3);

	}

}
