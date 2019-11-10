class A{
	B b;
	int i = 10 ;
	
}

class B{
	C c ;
	int j = 20 ;
	
}

class C{
	int k = 30 ;
	
}


class RefrenceVariableAssignment{
	
	public static void main(String[] args){
	
		A a = new A();
		a.i = 100;
		System.out.println(a.i);
		
		a.b = new B();
		a.b.j = 200 ;
		System.out.println(a.b.j);
		
		a.b.c = new C();
		a.b.c.k = 300;
		System.out.println(a.b.c.k);
		
		
		
	}
}

