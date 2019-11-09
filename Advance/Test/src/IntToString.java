import java.security.acl.Permission;
import java.util.Arrays;
import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {

		
		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			String s = String.valueOf(n);

			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (Exception e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}
