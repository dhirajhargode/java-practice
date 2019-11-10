package demo;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		Thread.yield();
		for(int i =1 ;i <=10;i++) {
			
			System.out.println("15 * "+ i +" = " + 15*i);
			
		}
	}
}
