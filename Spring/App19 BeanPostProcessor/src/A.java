
public class A {

	private int i;
	private int j;
	
	
	public A() {

		System.out.println("A : constructor");
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		System.out.println("setter method");
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		System.out.println("setter method");
		this.j = j;
	}

	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}

}
