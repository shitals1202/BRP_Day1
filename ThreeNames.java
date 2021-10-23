package classwork.Day1;

import java.util.Scanner;

public class ThreeNames{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words: ");
		String firstName=sc.nextLine();
		String secondName = sc.nextLine();
		String thirdName = sc.nextLine();
		System.out.println("hi "+thirdName+" "+secondName+" "+firstName);
		sc.close();
	}
}