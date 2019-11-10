package com.sleep;

public class MyThread extends Thread {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			System.out.println("Sleep time :"+i*2000);
			Thread.sleep(2000);
		}

	}

}
