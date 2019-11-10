class newthread implements Runnable {
	Thread t;

	newthread() {
		t = new Thread(this, "My Thread");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class multithreaded_programing {
	public static void main(String args[]) {
		new newthread();
	}
}