package com.lf.variable;

public class ComboDemo {

	private int x = 10; // varried from object to object
	private static int y = 20; // once assign apply for every object same until change

	public static void main(String[] args) {

		ComboDemo cd = new ComboDemo();
		cd.x = 888;
		cd.y = 999;

		System.out.println(cd.x + "-----" + cd.y);

		System.out.println();
		ComboDemo cd2 = new ComboDemo();

		System.out.println(cd2.x + "------" + cd2.y);

		System.out.println();
		ComboDemo cd3 = new ComboDemo();
		cd3.y = 111;
		System.out.println(cd3.x + "------" + cd3.y);

	}

}
