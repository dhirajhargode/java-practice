import java.util.Scanner;

 class IntDoubleStringtoStringDoubleInt{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter int : ");
		int i = scan.nextInt();
		System.out.println("enter double : ");
		double d = scan.nextDouble();
	
		System.out.println("enter string");
		String s = scan.nextLine();

		System.out.println("String " + s);
		System.out.println("double " + d);
		System.out.println("int " + i);
	}

}
