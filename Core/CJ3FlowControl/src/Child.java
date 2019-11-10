class Child extends Parent {

	int x = 100;
	{
		m1();
		System.out.println("first child instance block");
	}

	Child() {
		System.out.println("child const");
	}

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println("child main method");
	}

	public void m1() {
		System.out.println(y);
	}

	{
		System.out.println("2nd instance block");
	}
	int y = 200;

}
