
public class Example1 {
	
	static void m1(Object obj) {
		if(obj instanceof Object)
		System.out.println("if");
		else
			System.out.println("else");
		
	}
	public static void main(String[] args) {
		
		m1(new A());
		m1(new B());
	}
	

}
