package com.join2;

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {

		MyThread.mt = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();

		for (int i = 0; i < 10; i++) {

			System.out.println("main");
			Thread.sleep(1000);
		}
	}

}
