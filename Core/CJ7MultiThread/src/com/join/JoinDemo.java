package com.join;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {

		MyThread t = new MyThread();
		t.start();

		// waiting main thread until complete child thread

		// t.join();

		// waiting main thread only 10000ms
		t.join(10000);
		t.interrupt();

		for (int i = 0; i < 10; i++) {
			System.out.println("main");
		}

	}

}
