public class MyThread1 extends Thread{

	public void run(){
		
		for(int i = 0 ; i<10 ;)
			System.out.println(Thread.currentThread().getName()+" "+ ++i);
		
	}
	
}