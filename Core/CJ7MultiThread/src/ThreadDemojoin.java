
public class ThreadDemojoin
 {
	public static void main(String[] args) throws InterruptedException {
		//Thread.currentThread().join();
		MyThread.mt= Thread.currentThread();
		
		MyThread t = new MyThread();
		t.start();
	//	t.join(10000);
		for (int i = 1; i < 10; i++) {
			System.out.println("main");
		
		}
		
	}
}
