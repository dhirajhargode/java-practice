
class WrapperDemo{

	public static void main(String[] args){
		
		// boxing primitive to wrapper
		byte b = 10 ;
		Byte b1 = b;
		System.out.println(b1 == b);
		
		//unboxing wrapper to primitive
		Integer i1 = 120;
		Integer i2 = 1200;
		int i3 = i1;
		System.out.println(i3 == i1);  // pool == pool
		System.out.println(i1 == i2);  // pool == heap
		
		
		
		
	}

}