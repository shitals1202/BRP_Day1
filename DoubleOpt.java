package classwork.Day1;

import java.util.Scanner;

public class DoubleOpt{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a,b,c:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		isOperation(a,b,c);
		sc.close();
	}

	private static void isOperation(double a, double b, double c) {
		int firstresult, secondresult,thirdresult,fourthresult;
		firstresult = (int) (a+b*c);
		System.out.println("result of first operation is: "+firstresult);
		secondresult = (int) (a*b+c);
		System.out.println("result of second operation is: "+secondresult);
		thirdresult = (int) (c+a/b);
		System.out.println("result of second operation is: "+thirdresult);
		fourthresult = (int) (a%b+c);
		System.out.println("result of second operation is: "+fourthresult);
	}
}