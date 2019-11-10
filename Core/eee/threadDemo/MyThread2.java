public class MyThread2 extends Thread{

	public void run(){
		
		for(int i = 11 ; i<20 ;)
			System.out.println(Thread.currentThread().getName()+" "+ ++i);
		
	}
	
}