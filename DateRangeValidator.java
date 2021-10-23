package classwork.Day1;
import java.util.Date;
import java.util.Scanner;

public class DateRangeValidator{
	 private final static Date startDate = new Date(2020,3,20);
	 private final static Date endDate = new Date(2020,6,20);
	 
	 public static boolean isWhithinRange(Date testDate) {
		 return testDate.getTime() >= startDate.getTime() &&
	                testDate.getTime() <= endDate.getTime();
	 }
	 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a date:");
		  int testDate = sc.nextInt();
		  
				  
		 if(isWhithinRange(testDate)){
		   System.out.println("testDate is within the date range.");
	     }else{
		   System.out.println("testDate is NOT within the date range.");
	      }		  
	 }
	 
	
	 
}