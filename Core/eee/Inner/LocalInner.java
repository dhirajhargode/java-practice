
class MyLocalOuter{

	int y =20;
	
	void m1(){
		System.out.println(" Myoutre m1()");
		
		class MyLocalInner{
			
			void m1(){
				System.out.println(" Local inner m1()");
			}
		
		}
		MyLocalInner i = new MyLocalInner();
		i.m1();
	
	}
}

class LocalInner{
	public static void main(String[] args){
		
		MyLocalOuter o = new MyLocalOuter();
		o.m1();
		
	}
}