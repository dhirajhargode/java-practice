import java.util.Scanner;

public class TypesOfTriangle {

	int id;
	String name;
	double salary;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		System.out.println(findTriangle(a, b, c));
		sc.close();
	}

	private static String findTriangle(double a, double b, double c) {

		if (a + b > c && b + c > a && c + a > b) {
			if (a == b && a == c) {
				return "equvilateral";
			} else if ((a * a + b * b <= c * c + 0.000001 && a * a + b * b >= c * c - 0.000001)
					|| (b * b + c * c <= a * a + 0.000001 && b * b + c * c >= a * a - 0.000001)
					|| (c * c + a * a <= b * b + 0.000001 && c * c + a * a >= b * b - 0.000001)) {
				return "right-angled";
			} else if (a == b || b == c || c == a) {
				return "isoscelese";
			} else {
				return "notspecial";
			}
		}
		return "invalid";

	}
}
