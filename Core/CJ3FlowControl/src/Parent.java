class Parent {

	int i = 10;
	{
		m1();
		System.out.println("first Parent instance block");
	}

	Parent() {
		System.out.println("Parent const");
	}

	public static void main(String[] args) {

		Parent p = new Parent();

		System.out.println("Parent main method");
	}

	public void m1() {
		System.out.println(j);
	}

	{
		System.out.println("2nd instance block");
	}
	int j = 20;

}
