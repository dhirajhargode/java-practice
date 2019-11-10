package com.priority;

public class MainThreadDemo {

	public static void main(String[] args) {

		ChildThreadDemo c = new ChildThreadDemo();
		c.setPriority(10);
		System.out.println(c.getPriority());
		System.out.println(Thread.currentThread().getPriority());
		c.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main");
		}

	}

}
