
public class DemoApp {
	static {
		System.out.println("Demo App : static block");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("DemoApp main");

		@SuppressWarnings("unused")
		Test t1 = new Test();
		@SuppressWarnings("unused")
		Test t2 = new Test();

		Class.forName("Demo");
		Class.forName("Demo");

	}

}
