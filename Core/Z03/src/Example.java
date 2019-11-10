
public class Example {
	public static void main(String[] args) {
	m1(new A());
	m1(new B());
	}
	static void m1(A a1) {
		if(a1 instanceof A)
		System.out.println("hi");
		else
			System.out.println("Hello");
		
	
	}
}
