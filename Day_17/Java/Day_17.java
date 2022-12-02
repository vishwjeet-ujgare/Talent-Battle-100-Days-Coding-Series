import java.util.Scanner;

public class Day_17
{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter a Number : ");
		 int num=sc.nextInt();
		 System.out.println("Factorial of "+num+" are :");
		 
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.print(" "+i);
            }
        }
         System.out.print(" "+num);
            
        }
		 
	}