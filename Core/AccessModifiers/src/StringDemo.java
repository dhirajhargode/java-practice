import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		System.out.println("Enter String is :"+s);
		
		while(b == true) {
			
			System.out.println("1.charAt() 2.concate() 3.equal() 4.equalIgnoreCase() 5.substring()");
			System.out.println("6.substring(beg,end)  7.length()  8.replace(old, new)  9.trin() aa 10.indexOf()");
			System.out.println("11.toLowerCase()  12.toUpperCase()  13.contains() 14.split()  15.lastIndexOf()" );
			System.out.println("16. exit()");
			int ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("enter position to find char");
					System.out.println(s.charAt(sc.nextInt()));
					break;
				case 2:
					System.out.println("enter string to concate with "+s);
					System.out.println(s.concat(sc.next()));
					break;
				case 3:
					System.out.println("enter string to compare  with "+s);
					System.out.println(s.equals(sc.nextLine()));
					break;
				case 4:
					System.out.println("enter string to compare with "+s+"ignore case");
					System.out.println(s.equalsIgnoreCase(sc.nextLine()));
					break;
				case 5:
					System.out.println("enter no to substring from to end");
					System.out.println(s.substring(sc.nextInt()));
					break;
				case 6:

					System.out.println("enter no to substring from to ...");
					System.out.println(s.substring(sc.nextInt(),sc.nextInt()));
					break;
				case 7:
					System.out.println("length of string "+s.length());
					break;
				case 8:
					System.out.println("enter old char to replace with new char");
					System.out.println(s.replace(sc.next().charAt(0), sc.next().charAt(0)));
					break;
				case 9:
					System.out.println("enter String to trim");
					String s1 = sc.next();
					System.out.println(s1.trim());					
					break;
				case 10:
					System.out.println("find the index of char ");
					System.out.println(s.indexOf(sc.next()));
					break;
				case 11:
					break;
				case 12:
					break;
				case 13:
					break;
				case 14:
					break;
				case 15:
					break;			
				case 16:
					break;
				
			}
		}
		
	}
}
