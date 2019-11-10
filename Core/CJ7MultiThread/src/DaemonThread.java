
public class DaemonThread {
	public static void main(String[] args) {
		Thread1 t = new Thread1();
		// t.setDaemon(true);
		t.start();
		System.out.println("end of deamon");
		
		t.stop();
		for (int i = 0; i < 1000; i++) {
			System.out.println("main thread");
	}

}
}