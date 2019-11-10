package demo;

public class ThreadDemo1 {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t2.setPriority(10);
		t1.setPriority(1);
	
		t1.start();
		t2.start();
		}
}
