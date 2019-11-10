package com.threadname;

public class ThreadDemo {

	public static void main(String[] args) {

		System.out.println((Thread.currentThread().getName()));

		MyThread t = new MyThread();
		System.out.println(t.getName());

		Thread.currentThread().setName("My Thread"); // main thread name change
		System.out.println(Thread.currentThread().getName()); // main thread

		t.setName("child Thread");
		System.out.println(t.getName());

	}
}
