package classwork.Day1;

import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter and year: ");
		year = sc.nextInt();
		isLearYear(year);
		sc.close();
	}

	private static void isLearYear(int year) {
		if(year % 4==0 && year%100 !=0 || year %400 ==0 ) {
			System.out.println("This is leap year");
		}
		else {
			System.out.println("This is not a Leap Year");
		}
	}
}