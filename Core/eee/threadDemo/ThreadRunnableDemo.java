
class ThreadRunnableDemo{
	
	public static void main(String[] args){
		
		RunnableDemo1 rd1 = new RunnableDemo1();
		Thread t1 = new Thread(rd1);
		
		RunnableDemo2 rd2 = new RunnableDemo2();
		Thread t2 = new Thread(rd2);
		
		t2.start();
		
		try{
			t2.join();
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		t1.start();
		
		
	}
	
}