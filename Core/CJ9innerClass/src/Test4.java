interface outer1 {
	public void m1();

	interface inner {
		public void m2();

	}
}

class T1 implements outer1 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("outer inetrface");
	}

}

class T2 implements outer1.inner {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("inner interface");
	}

}

class Test4 {

	public static void main(String[] args) {
		T1 t = new T1();
		t.m1();
		T2 t2 = new T2();
		t2.m2();

	}
}
