package prepare.exam;

class NewThread implements Runnable {

	Thread t;

	public NewThread() {
		t = new Thread(this, "My Thread");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class multithreaded_programing {
	public static void main(String[] args) {
		new NewThread();

	}
}
