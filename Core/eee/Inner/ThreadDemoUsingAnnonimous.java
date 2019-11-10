


class ThreadDemoUsingAnnonimous{
	
	Runnable r = new Runnable(){
		public void run(){
			System.out.println("OK");
		}
	};

	Thread t = new Thread(r);
	t.start();
	
}