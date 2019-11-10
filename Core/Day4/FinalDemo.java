
class FinalDemo{

	public static void main(String[] args){
		
		final int x ;
		
		// System.out.println(x); // compile time error x is final
		
		final int i = 10 ;
		int j = 10 ;
		
		x = 10;
		System.out.println("X = "+x);

		// x = 20;  // we cant change the final variable
		System.out.println("X = "+x);  
		int b = 100;
		switch(b){
			
			case 0: break;
			case 5: break;
			case i: break;    // compile time constant required
			//case j: break;   // error : constant required
			//case x: break;   // error : constant required
		}
	}


}