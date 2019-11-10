
public class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("child thread");
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
*/		}

	}

}
