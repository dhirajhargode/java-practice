package com.hr;

import java.util.Scanner;

public class ReadCmdLine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Write what you want");
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

	}

}
