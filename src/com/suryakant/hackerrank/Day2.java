package com.suryakant.hackerrank;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		int newInt;
		double d2;
		String s2;

		newInt = scan.nextInt();

		d2 = scan.nextDouble();
		//this next line is added so thta it will accept /n for above line 
		//scan.nexrtLine is the method to acecpt as line input in the form of string 
		scan.nextLine();
		s2 = scan.nextLine();

		System.out.println(i + newInt);

		System.out.println(d + d2);

		System.out.println(s + s2);

		scan.close();
	}
}
