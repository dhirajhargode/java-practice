

class A {

	void m1(){
		
		System.out.println("Inside m1 class A ");
	
	}

	public static void main(String[] args){
	
		B b = new B();
		b.m1();
		
	}

}

final class B{

	
	void m1(){
		
		System.out.println("Inside m1 class B ");
	
	}
}

	
