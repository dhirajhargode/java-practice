import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		 String S = sc.nextLine();
		 System.out.println("Start no");
		 int start = sc.nextInt();
		 System.out.println("end no");
		 int end = sc.nextInt();

		 System.out.println(S.substring(start,end));

	}

}
