package com.hr;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DateAndTime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Date in number formate");
		int dd = sc.nextInt();

		System.out.println("Enter Month in number formate");
		int mm = sc.nextInt();

		System.out.println("Enter Year in number formate");
		int yy = sc.nextInt();

		getDay(dd, mm, yy);

	}

	public static void getDay(int dd, int mm, int yy) {

		LocalDate dt = LocalDate.of(yy, mm, dd);
		DayOfWeek dow = dt.getDayOfWeek();
		System.out.println(dow);
	}

}
