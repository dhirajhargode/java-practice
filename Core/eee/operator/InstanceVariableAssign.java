class A{
	int x = 10;
	void m1(){
		
	}
	
	void m2(){
		System.out.println("a m2");	
	}
}
class B extends A{
	int x = 20;
	
	
	void m2(){
		System.out.println("b m2");	
	}
}


class InstanceVariableAssign{
	
	public static void main(String [] args){
		A a = new B();
		System.out.println(a.x);
		a.m2();
	}
	
}