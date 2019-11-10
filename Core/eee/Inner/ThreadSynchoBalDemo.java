
class Bank{

	double balance  = 1000;
	
	public synchronized void withdraw(double amt){
		System.out.println(Thread.currentThread().getName()+ " bal "+ balance);
		balance = balance - amt;
	}
	
	
}


class ThreadSynchoBalDemo {
	
	public static void main(String[] args) {
	
		Bank b = new Bank();
		Runnable r1 = () -> {
			while(b.balance>0){
				if(b.balance > 100){
					try{
						Thread.sleep(20);	
					}catch(InterruptedException e){ }
					
					b.withdraw(100);
				}
			}
		};
		
		
		Runnable r2 = () -> {
			while(b.balance>0){
				if(b.balance >= 100){
					try{
						Thread.sleep(20);	
					}catch(InterruptedException e){ }
					
					b.withdraw(100);
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
	
	
}