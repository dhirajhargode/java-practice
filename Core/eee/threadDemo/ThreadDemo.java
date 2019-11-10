
class ThreadDemo{

	public static void main(String[] args){
		
		Thread.currentThread().setName("Dhiraj main");
		
		MyThread1 t1 = new MyThread1();
		t1.setName("MyThread1");
		t1.start();
		try{
			t1.join();		
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
		MyThread2 t2 = new MyThread2();
		t2.setName("MyThread2");
		t2.start();
		
		for(int i = 0; i<10 ; )
			System.out.println(Thread.currentThread().getName()+" "+ ++i );
		
	}

}
