class Demo1{

	public static void main(String[] args){
			
		byte b = 10;
		short s = 20;
		m1('a');
		m1(b);
		m1(s);
		m1(10l);
			
	}
	
	public static void m1(int x){
		System.out.println("int");
	}
	/*
	public static void m1(long x){
		System.out.println("long");
	}
	*/
	public static void m1(double x){
		System.out.println("float");
	}
}