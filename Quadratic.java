package classwork.Day1;

import java.util.Scanner;

public class Quadratic{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of a,b,c: ");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		isOperation(a,b,c);
		sc.close();
	}

	private static void isOperation(int a, int b, int c) {
		int delta,root1,root2,equation;
		delta =b*b-4*a*c;
		System.out.println("Delta: "+delta);
		root1=(int) ((-b + Math.sqrt(delta))/(2*a));
		System.out.println("Root 1:"+root1);
		root2 = (int) ((-b - Math.sqrt(delta))/(2*a));
		System.out.println("Root 2:"+root2);
		
		equation = a* root1*root1 + b*root1 +c;
		System.out.println("Equation: "+equation);
	}

	
}