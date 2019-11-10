class Test{
	int i;
	int j;
	
	void print(){
		System.out.println(i);
		System.out.println(j);
		
		
	}
	
	
}


class RefrenceDemo{

	static void invokeTest(Test t){
		t.i = 10;
		t.j = 20;
		t.print();
	}


	public static void main(String[] args){
	
		Test t1 = new Test();
		invokeTest(t1);
		
	
	}
}