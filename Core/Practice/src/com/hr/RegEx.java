package com.hr;

import java.util.Scanner;

public class RegEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter IP Address");
		while (sc.hasNext()) {
			String ip = sc.next();
			boolean condtn = ip.matches(new MyRegEx().pattern);
			System.out.println(condtn);
		}
		sc.close();
	}
}

class MyRegEx {

	// 0-9 | 00-99 | 099-199 | 200-249 | 250-255
	/*String zeroTo255 = "[0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|(2)[0-4][0-9]|(25)[0-5]";*/
	String zeroTo255 = "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
	
	public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;

}
