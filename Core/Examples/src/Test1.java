import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();
		String B = sc.nextLine();

		System.out.println(A.length() + B.length());
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "no");
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1, A.length())
				+" "+ B.substring(0, 1).toUpperCase() + B.substring(1, B.length()));

	}

}
