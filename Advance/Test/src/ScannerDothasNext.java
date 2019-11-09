import java.util.Scanner;

public class ScannerDothasNext {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(sc.hasNext()) {
			i++;
			System.out.println(i+" "+sc.nextLine());
		}
		
		
	}
}
