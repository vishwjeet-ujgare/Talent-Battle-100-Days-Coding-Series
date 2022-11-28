// Day 13 coding Statement: 
// Write a program to find Sum of N natural numbers
import java.util.Scanner;
public class Day_13
{
	public static void main(String[] args) {
	 
	 Scanner sc =new Scanner(System.in);
	 
	 System.out.print("Enter number : ");
	 int num =sc.nextInt();
	 
	 int sum =0;
	 
	 for(int i=1;i<=num;i++)
	 {
	     sum+=i;
	 }
	 System.out.println("Sum of "+num+" natural number = "+sum);
	}
}
