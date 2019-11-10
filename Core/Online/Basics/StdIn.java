import java.util.Scanner;


class StdIn{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Integer: ");
		Integer i = sc.nextInt();
		System.out.println("Double: ");
		Double d = sc.nextDouble();
		sc.nextLine();
		System.out.println("String : ");
		String s = sc.nextLine();
		
		
		System.out.println(s);
		System.out.println(d);
		System.out.println(i); 
		
		
		String s1 = sc.nextLine();
		Integer i1 = sc.nextInt();
		sc.nextLine();
		String s2 = sc.nextLine();
		Integer i2 = sc.nextInt();
		sc.nextLine();
		String s3 = sc.nextLine();
		Integer i3 = sc.nextInt();
		
		System.out.printf("%-20s%d %5d\n",s1,i1,i1);
		
		System.out.printf("%-20s%d %5d\n",s2,i2,i2);
		
		System.out.printf("%-20s%d %5d\n",s3,i3,i3);
		
	}
	
}