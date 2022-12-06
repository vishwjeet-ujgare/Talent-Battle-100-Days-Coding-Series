// Day 20 coding Statement : 
// Write a program to identify if the number is Prime number or nots

import java.util.Scanner;

public class Day_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number : ");
	int num=sc.nextInt();

	if(num==1)
	{
		System.out.println(num+" is not a Prime number.");
		sc.close();
		return ;
	}
	else
	{
		boolean isArmstrong=true;
		for(int i =2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isArmstrong=false;
				break;
			}
			
		}

		if(isArmstrong)
		{
			System.out.println(num+" is an Prime number.");

		}else{
			System.out.println(num+" is not a Prime number.");
		}

	}
	

        sc.close();
    }
}
