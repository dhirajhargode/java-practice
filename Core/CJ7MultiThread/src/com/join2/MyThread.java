package com.join2;

public class MyThread extends Thread {

	public static Thread mt;

	@Override
	public void run() {

		try {
			mt.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Child");
		}

	}

}
