
class MyOuter{
	
	int x = 10;
	
	void m1(){
		System.out.println(" Myoutre m1()");
		MyInner i = new MyInner();
		i.m1();
	}
	
	class MyInner{
		
		void m1(){
			System.out.println(" MyInner m1()");
			
		}
	}
	
}

class InstanceInner{
	
	public static void main(String[] args){
	
		MyOuter o = new MyOuter();
		o.m1();
		
	}
}