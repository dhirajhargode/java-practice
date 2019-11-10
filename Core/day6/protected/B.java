package pack1;


public class B extends A {

	public static void main(String[] args){
		
		A a = new A();
		a.m1();
		B b = new B();
		b.m1();
	}

/*
	protected void m1(){
		System.out.println("B:: m1()");
	}
*/
}