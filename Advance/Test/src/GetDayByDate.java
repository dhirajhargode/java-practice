import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class GetDayByDate {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		
		
		
		
		getDay(dd,mm,yy);
	}
	public static void getDay(int yy,int mm,int dd) {
		LocalDate dt=LocalDate.of(yy, mm, mm);
		System.out.print(dt.getDayOfWeek());
	}

}
