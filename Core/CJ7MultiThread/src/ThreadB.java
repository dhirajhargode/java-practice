
public class ThreadB extends Thread {
	int t = 0;

	public void run() {

		synchronized (this) {

			System.out.println("Child start calculatin .");
			for (int i = 0; i <= 100; i++) {
				t = t + i;

			}
			System.out.println("child thread give notification");
			this.notify();
		}
	}

}
