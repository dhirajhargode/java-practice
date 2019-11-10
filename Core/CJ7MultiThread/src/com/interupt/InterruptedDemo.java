package com.interupt;

public class InterruptedDemo {
	public static void main(String[] args) throws InterruptedException {

		MyThread t = new MyThread();
		t.start();

		// apply only in sleep so one time print lazy
		t.interrupt();
		System.out.println("End of main");
	}

}
