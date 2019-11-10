package com.join;

public class MyThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Child");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}

	}

}
