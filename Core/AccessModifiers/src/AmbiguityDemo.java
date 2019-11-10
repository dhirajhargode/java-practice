// in both packages Date() is available

import java.sql.Date;
//import java.util.Date;
public class AmbiguityDemo {


	public static void main(String[] args) {
		
		Date d = new Date(0);
		Math.sqrt(25);
		System.out.println(Integer.MAX_VALUE);
	}
}
