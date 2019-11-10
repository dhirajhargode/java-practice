
class Test {

	public void m1() {

		/*
		 * public void sum(int x,int y) { can't declare inside method is method }
		 */

		class Inner {
			public void sum(int x, int y) {
				System.out.println(x + y); // can't declare inside method is method
			}

		}
		Inner i = new Inner();
		i.sum(10, 20);
		i.sum(100, 200);
		i.sum(1000, 2000);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
