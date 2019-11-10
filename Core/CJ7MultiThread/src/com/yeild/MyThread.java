package com.yeild;

public class MyThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			Thread.yield();
			System.out.println("Child");
		}

	}

}
