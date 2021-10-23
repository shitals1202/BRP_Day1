package classwork.Day1;

import java.util.Scanner;

public class IntOpt{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a,b,c");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		isOperation(a,b,c);
		sc.close();
	}

	private static void isOperation(int a, int b, int c) {
		int firstresult, secondresult,thirdresult,fourthresult;
		firstresult = a+b*c;
		System.out.println("result of first operation is: "+firstresult);
		secondresult = a*b+c;
		System.out.println("result of second operation is: "+secondresult);
		thirdresult = c+a/b;
		System.out.println("result of second operation is: "+thirdresult);
		fourthresult = a%b+c;
		System.out.println("result of second operation is: "+fourthresult);
	}
}