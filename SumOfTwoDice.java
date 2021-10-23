package classwork.Day1;

public class SumOfTwoDice{
	public static void main(String[] args) {
		int sides = 6;
		int a= 1+(int)(Math.random() * sides);
		int b= (int) (1+ (Math.random()*sides));
		int sum = a+b;
		System.out.println("SUM: "+sum);
	}
}