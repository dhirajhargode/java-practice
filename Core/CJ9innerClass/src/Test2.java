
public class Test2 {

	 int x = 10;

//	static int y = 20;

	public static void m1() {

//		int x = 100;

		int y = 200;

		class Inner {

			public void m1() { // static can't
	//			System.out.println(Test2.this.x); 								int x in Test is instance
		//		System.out.println(x);

	//			System.out.println(Test2.this.y);

				System.out.println(y);
			}

		}
		Inner i = new Inner();

		i.m1();
	}

	public static void main(String[] args) {

		Test2 t = new Test2();
		t.m1();
	}
}