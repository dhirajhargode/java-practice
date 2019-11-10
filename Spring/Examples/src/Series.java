import java.util.Scanner;

public class Series {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		// int t = in.nextInt();
		// for (int i = 0; i < 1; i++) {
		System.out.println("Enter a");
		int a = in.nextInt();
		System.out.println("Enter b");
		int b = in.nextInt();
		System.out.println("Enter n");
		int n = in.nextInt();
		for (int j = 0; j < n; j++) {
			a += b;
			if (j > 0)
				System.out.print(" ");
			System.out.print(a);

			b = b * 2;
			// }
			System.out.println("");
		}
		in.close();
	}
}
