package com.synchronize.block;

public class Display {

	public void wish(String name) {

		;
		;
		;
		;
		;
		;
		;
		;
		;
		;// 1 lack line
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Good Morning");

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {

				}
				System.out.println(name);
			}
		} // synchronized
		;
		;
		;
		;
		;// 1 lack line
	}

}
