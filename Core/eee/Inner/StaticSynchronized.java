class A{
	
	static synchronized void m1(){
		System.out.println(Thread.currentThread().getName()+" m1()");
		
	}
	
	static synchronized void m2(){
		System.out.println(Thread.currentThread().getName()+" m2()");
		
	}
	
	
}


class StaticSynchronized{
	
	
		static A a1 = new A();
		static A a2 = new A();
		

	public static void main(String[] args) {
		
		
		Runnable r1 = () ->{
			System.out.println(Thread.currentThread().getName()+"- Started " );
			a1.m1();
			System.out.println(Thread.currentThread().getName()+"- finished ");
		};
		
		Runnable r2 = () ->{
			System.out.println(Thread.currentThread().getName()+"- Started ");
			a2.m2();
			System.out.println(Thread.currentThread().getName()+"- finished ");
			
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		try{
			Thread.sleep(10);
		}catch(InterruptedException ie){
			System.out.println(ie);
		}
		t2.start();
		
	}
	
	
}