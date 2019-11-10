import java.util.Scanner;

public class DataBasaFormate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 10; i++) {
			System.out.println("enter name 15 digit");
			String s1 = sc.next();
			System.out.println("enter 3 digit no");
			int x = sc.nextInt();
			// Complete this line
			System.out.printf("%-15s%03d%n", s1, x);
			System.out.println("again enter");
		}
		System.out.println("================================");

	}

}
