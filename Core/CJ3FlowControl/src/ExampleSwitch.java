
public class ExampleSwitch 
{
	public static void main(String[] args) {

/*	// 1  case and default are optional	
		int x=10;
		switch(x)
		{
		
		}
	
		
	// 2 inside 9 errors
		int y=10;
		switch(y)
		{
			System.out.println("hello");
		}
	*/	
	// 3 
		int a=10;
	final	int b=20;
		
		switch(a)
		{
			case 10:
				System.out.println("10");
				break;
			case b :							// case always constant req
				System.out.println("20");
				break;
		}

		
	// 4   case expresion can be operation
		
		int c=10;
		switch(c+1)
		{
		case 10:
			System.out.println("10");
			break;
			
		case 10+20:
			System.out.println("30");
			break;
			
		case 10+20+30:
			System.out.println("60");
			break;
		}
		
		
		
		
	// 5 every case label with in range char range -128 - 127	
			
		char d=10;
		switch(d)
		{
		case 10:
			System.out.println("10");
			break;
			
		case 100:
			System.out.println("100");
			break;
			
		case 1000:						// over range
			System.out.println("1000");
			break;

		}
		
	// 6	
		int e=10;
		switch(e)
		{
		case 97:
			System.out.println("97");
			break;
			
		case 98:
			System.out.println("98");
			break;
			
		case 99:
			System.out.println("99");
			break;
		/*	
		case 'a':								//repeat 97==a both are same duplicate case labels are not allowed otherwise we will get compile time error 
			System.out.println('a');		
			break;
		*/}
		
		
	// 7	without break next case work		x=0   : 0 1	 x=1 : 1
											// x=2 :2 def  x=3 :def
		
		int x=0;
		switch(x)
		{
		case 0:
			System.out.println("0");
			
			
		case 1:
			System.out.println("1");
			break;
			
		case 2:
			System.out.println("2");
			
		//case def:						 // at starting we can  use and follow all until break
			
			System.out.println("def");
			break;
		}
		
	}
}
