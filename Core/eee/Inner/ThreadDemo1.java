
class ThreadDemo1{
	

	public static void main(String[] args) {
		
		Thread t1 = new Thread(){
			public void run(){
				for(int i = 0 ; i<10 ;){
					System.out.println(Thread.currentThread().getName()+"-"+ i++);
					try{
						Thread.sleep(500);
					}catch(InterruptedException ie){
						System.out.println(ie);
					}
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				for(int i = 0 ; i<10 ;){
					System.out.println(Thread.currentThread().getName()+"="+ i++);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException ie){
						System.out.println(ie);
					}
				}
			}
		};
		
		
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		/*
		try{
			
			t1.join();
		}catch(InterruptedException ie){
			System.out.println(ie);
		}
		*/
		t2.start();
		Thread.yield();
		
	}
	
	
}
