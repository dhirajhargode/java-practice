public strictfp class Test1{

	public static void main(String[] args){
		//m1();
		//m2();
		//m3();
		//System.out.println(m4());
		System.out.println(m5());
	}
	
	public static void m1(){
		System.out.println("no exception statement");
		
		try{
			System.out.println("try block");
		}catch(Exception e){
			System.out.println("catch block");
		}finally{
			System.out.println("finally block");
		}
		
	}
	
	public static void m2(){
		System.out.println("Exception raised statement");
		
		try{
			System.out.println("try block");
			int x = 10/0;
		}catch(ArithmeticException e){
			System.out.println("catch block");
		}finally{
			System.out.println("finally block");
		}
		
	}
	public static void m3(){
		System.out.println("Exception raised but no catch block statement");
		
		try{
			System.out.println("try block");
			int x = 10/0;
		}catch(NullPointerException e){
			System.out.println("catch block");
		}finally{
			System.out.println("finally block");
		}
		
	}
	
	public static int m4(){
		System.out.println("return vs finally");
		
		try{
			System.out.println("try block");
			int x = 10/0;
			return x;
		}catch(NullPointerException e){
			System.out.println("catch block");
		}finally{
			System.out.println("finally block");
			return 20;
		}
		
	}
	
	public static int m5(){
		System.out.println("finally block wont execute ");
		
		try{
			System.out.println("try block");
			int x = 10/0;

		}catch(ArithmeticException e){
			System.out.println("catch block");
			System.exit(0);
		}finally{
			System.out.println("finally block");
			return 20;
		}
		
	}
	
}