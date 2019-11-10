package com.priority;

public class ThreadDemo {

	public static void main(String[] args) {

		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		MyThread t = new MyThread();

		t.start();
		System.out.println(t.getPriority());

	}

}
