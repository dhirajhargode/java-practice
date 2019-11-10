package com.interupt;

public class MyThread extends Thread {

	@Override
	public void run() {

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("I am lazy thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("i got interupted");
		}

	}
}
