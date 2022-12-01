// Day 16 coding Statement : 
// Write a program to identify if the number is Perfect number or not
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		
		int perfectNum=1;
		
		for(int i=2;i<=num/2;i++)
		{
		    if(num%i==0)
		    {
		        perfectNum+=i;
		    }
		}
		
		if(num==perfectNum)
		{
		    System.out.print(num+" is a Perfect Number.");
		}else{
		    System.out.print(num+" is Not A Perfect Number.");   
		}	
	}
}
