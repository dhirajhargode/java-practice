
class StaticFlowExicution{

	static int i=10;
	
	static{
		System.out.println("First static block..start");
		methodOne();
		System.out.println("First static block..end");
	}
	

	public static void main(String[] args){
	
		System.out.println("Main method...start");
		methodOne();
		System.out.println("Main method...end");
		
		
	}

	public static void methodOne(){
		System.out.println("Method one... Start");
		System.out.println("value of i "+i);
		System.out.println("value of j "+j);
		System.out.println("Method one... end");
		
	}
	
	static{
		
		System.out.println("Second Static Block..");
	
	}
	
	static int j=20;
}
	
