package com.mt1;

public class MyThread extends Thread{

	@Override
	public synchronized void start() {
		super.start();
		System.out.println("start");
	}
	@Override
	public void run() {
		System.out.println("run");
	}
}
