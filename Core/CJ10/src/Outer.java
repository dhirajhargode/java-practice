public class Outer {
	int x, y;
	Outer(int x, int y) {
		x += 8;
		y += 3;
		System.out.print("x" + x + this.x + ",");
		System.out.print("y" + this.y + ",");
	}
	class Inner {
		int x, y;
		Inner() {
			x += 3;
			y += 2;
			System.out.print("x" + x + ",");
			System.out.print("y" + y);
		}
	}
	public static void main(String[] args) {
		Inner inner = new Outer(4, 5).new Inner();
	}
}