class Test{
	int x;
	
	public static void main(String[] args){
	
		System.out.println("main() start");
		m1();
		System.out.println("main() end");
		
	}
	
	public static void m1() {
		System.out.println("m1() start");
		m2();
		System.out.println("m1() end");
		
	}
	
	public static void m2() {
		Test t = null;

	System.out.println("m2() start");
		try{
			t = new Test();
			Test t2 = null;
			t2.x = 100;
			t = null;
		}catch(ArithmeticException ae ){
			System.out.println(ae.getMessage());
		}catch(NullPointerException npe ){
			System.out.println(npe);
		}
		finally{
			if(t!= null)
				t=null;
			
		}
		System.out.println("m2() end");
	}
	
}