
class PopCorn {
	public void taste() {
		System.out.println("spicy");
	}

}

class Test3 {
	// public static void main(String[] args) {
	public static void main(String[] args) {

	

	PopCorn p = new PopCorn() {
			public void taste() {
				System.out.println("salty");
			}

		};
		p.taste();
	PopCorn p2 = new PopCorn();p2.taste();

}}