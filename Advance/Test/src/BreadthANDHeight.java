import java.util.Scanner;

public class BreadthANDHeight {

	static {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int b = sc.nextInt();
		int h = sc.nextInt();

		if (b <= 0 || h <= 0) {
			flag = false;
			try {
				throw new Exception("Breadth and height must be positive");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

	}

}
