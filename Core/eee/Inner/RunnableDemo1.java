


class RunnableDemo{
	

	public static void main(String[] args) {
		
		Runnable r1 = () ->{
			for(int i = 0 ; i<10 ;){
				System.out.println(Thread.currentThread().getName()+"-"+ i++);
				try{
					Thread.sleep(500);
				}catch(InterruptedException ie){
					System.out.println(ie);
				}
			}
		};
		
		Runnable r2 = () ->{
			for(int i = 10 ; i<20 ;){
				System.out.println(Thread.currentThread().getName()+"*"+ i++);
				try{
					Thread.sleep(500);
				}catch(InterruptedException ie){
					System.out.println(ie);
				}
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();
		
	}
	
	
}
