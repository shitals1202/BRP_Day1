package classwork.Day1;

import java.util.Scanner;

public class Distence{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x and y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		isOperation(x,y);
		sc.close();
	}

	private static void isOperation(int x, int y) {
		int distence;
		distence = (int) Math.sqrt(Math.pow(x, x)+(Math.pow(y, y)));
		System.out.println("Distence: "+distence);
	}
}