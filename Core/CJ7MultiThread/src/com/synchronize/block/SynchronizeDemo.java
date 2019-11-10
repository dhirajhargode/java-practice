package com.synchronize.block;

public class SynchronizeDemo {

	public static void main(String[] args) {

		Display d1 = new Display();
		MyThread t1 = new MyThread(d1, "Dhoni");
		MyThread t2 = new MyThread(d1, "Yuvraj");
		t1.start();
		t2.start();

	}

}
