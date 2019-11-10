
class VarArgDemo{
	
	
	public static void main(String[] args){
		
		m1();   // list priority
		m1(10);
		
		m2(100);
		m3();   // list priority
		m3(200);
	//	m4(50);
		
	}

	// widening prefer over var arg
	static void m1(int x){
		System.out.println("widening");
	}
	static void m1(int...x){
		System.out.println("var arg");
	}
	
	// widening prefer over boxing
	static void m2(Integer x){
		System.out.println("Boxing");
	}
	static void m2(int x){
		System.out.println("widening");
	}
	
	
	// Boxing prefer over var arg
	static void m3(Integer x){
		System.out.println("Boxing");
	}
	static void m3(int...x){
		System.out.println("var arg");
	}
	
	
	/*  
	************ ambuguity problem ********
	// widening...  boxing....
	static void m4(Integer... x){
		System.out.println("Boxing");
	}
	static void m4(int... x){
		System.out.println("widening");
	}
	*/
	
}