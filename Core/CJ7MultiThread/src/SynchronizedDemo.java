class Display {

	public synchronized void wish(String name) {
		for (int i = 0; i <= 10; i++) {
			System.out.print("good morning ");
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {

			}
			System.out.println(name);
		}
	}
}

class MyThread1 extends Thread {
	Display d;
	String name;

	MyThread1(Display d, String name) {
		this.d = d;
		this.name = name;

	}

	public void run() {
		d.wish(name);
		;
	}
}

class SynchronizedDemo {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread1 t1 = new MyThread1(d, "Dhiraj");
		t1.start();
		MyThread1 t2 = new MyThread1(d, "Chetan");
		t2.start();

	}
}
