
class A{
	
	int i ;
	int j ;
	int k ;
	
	
	// this keyword only use 3 places init , const and non static method
	A(int i,int j){
		this.i = i;  // if not used this assign to local variable;
		this.j = j;  // if not used this assign to local variable;
	}
	
	A(int x){
		k = x ;
	}
	
	
}

class ThisDemo{

	public static void main(String[] args){
		
		A a = new A(10,20);
		System.out.println(a.i);   
		System.out.println(a.j);
		
		A a2 = new A(30);
		System.out.println(a2.k);
		
	}

}