
class StaticAndInstance{
	
	static int i = 10;
	int j =20;
	
	StaticAndInstance(){
		System.out.println("inside constructor..");
		
	}
	
	
	
	//static block
	static{
		
		System.out.println("Inside static block 1 : i = "+i);
		i = 1000;
		methodOne();
		
	}
	
	//instance block
	{
		System.out.println("Inside instance block 1 : j = "+j);
		j = 2000;
		methodOne();
	}
	
	
	
	public static void main(String[] args){
		
		StaticAndInstance si = new StaticAndInstance();
		
	}
	
	//instance block
	{
		System.out.println("Inside instance block 2 : j = "+j);
	}
	
	//static block
	static{
		
		System.out.println("Inside static block 2 : i = "+i);
		
	}
	
	static void methodOne(){
		System.out.println("inside methodOne() ");
	}
	
}