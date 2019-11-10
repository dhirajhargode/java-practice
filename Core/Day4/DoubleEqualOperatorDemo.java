class A{
	
	int a=10;
	int b=20;
	
}



class DoubleEqualOperatorDemo{

	

	public static void main(String[] args){

		A a1 = new A();
		A a2 = new A();
		
		int x = 10;
		int y = 10;
		
		System.out.println("data comparison : X == Y :: "+(x == y));
		System.out.println("refrence comparision : a1 == a2 : "+(a1 == a2) );
		
		a2 = a1 ;
		
		System.out.println("refrence comparision : a1 == a2 :"+(a1 == a2));
		
			
		
	}

}