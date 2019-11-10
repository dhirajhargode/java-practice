
class DataTypesSize{

	static char c='a';

	public static void main(String[] args){
		
		System.out.println("Size of byte  :  " + Byte.SIZE + "bits  " + Byte.SIZE/8 + "byte");
		System.out.println("Size of char  : " + Character.SIZE + "bits  " + Character.SIZE/8 + "byte");
		System.out.println("Size of short : " + Short.SIZE + "bits  " + Short.SIZE/8 + "byte");
		System.out.println("Size of int   : " + Integer.SIZE + "bits  " + Integer.SIZE/8 + "byte");
		System.out.println("Size of long  : " + Long.SIZE + "bits  " + Long.SIZE/8 + " byte");
		System.out.println("Size of float : " + Float.SIZE + "bits  " + Float.SIZE/8 + "byte");
		System.out.println("Size of double: " + Double.SIZE + "bits  " + Double.SIZE/8 + "byte");
					
	}

}