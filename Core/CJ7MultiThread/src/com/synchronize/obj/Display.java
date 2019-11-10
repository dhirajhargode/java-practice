package com.synchronize.obj;

public class Display {

	public synchronized void displaynumber() {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		}
	}

	public synchronized void displaychar() {
		for (int i = 65; i < 75; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		}
	}

}
