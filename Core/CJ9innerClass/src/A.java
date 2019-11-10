
public class A {
	public void m1() {
		System.out.println("A class");
	}

	class B {
		public void m1() {
			System.out.println("B class");
		}

		class C {
			public void m1() {
				System.out.println("C class");
			}
		}
	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();

		A.B b = a.new B();
		b.m1();

		A.B.C c = b.new C();
		c.m1();
	}

}
