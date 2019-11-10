package com.gc.test;

public class FinalizationCase3 {
	static FinalizationCase3 s;
	public static void main(String[] args) throws InterruptedException {
		
		FinalizationCase3 t= new FinalizationCase3();
		System.out.println(t.hashCode());
	//	t.finalize();
		t=null;
		System.gc();
		Thread.sleep(1000);
		
		System.out.println(s.hashCode());
		//s=null;
		System.out.println("end of main");
	}
	
	public void finalize()
	{
		
		System.out.println("finalize method");
		s=this;
	}

}
