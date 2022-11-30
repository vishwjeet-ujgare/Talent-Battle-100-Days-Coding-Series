// Day 15 coding Statement : 
//             Write a program to identify if the number is Strong number or not

// Description:
// Get a number as input from user and then check whether that number is a strong number 
// or not. 
// A number is said to be strong number if the sum of the factorial of each digit
// in the number is same as that of the number.

// E.g. let the number be 145
// Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int temp=num;
		
		int tempStrong=0;
		while(num>0)
		{
		  int rem=num%10;
		  tempStrong= tempStrong+getFactorialOfNumber(rem);
		  num =num/10;
		}
		
		if(temp==tempStrong)
		{
		   System.out.println(temp+" is a strong number"); 
		}
		else{
		    System.out.println(temp+" is a not strong number");
		}
		
		
	}
	
	public static int getFactorialOfNumber(int num)
	{
	    if(num==0)
	    {
	        return 1;
	    }
	    return num * getFactorialOfNumber(num-1);
	}
}
