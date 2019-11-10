import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class FindDay {

	public static void main(String[] args) {
		
		
		findDay(8,5,2015);
		
		
	}
	
	public static void findDay(int m ,int d ,int y) {
		LocalDate c = LocalDate.of(y, d, m);
		DayOfWeek s = c.getDayOfWeek();
		System.out.println(s);		
		
	}
}
