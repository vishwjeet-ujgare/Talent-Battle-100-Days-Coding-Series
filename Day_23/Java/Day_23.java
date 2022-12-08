//Day 23 coding Statement : 
//Write a program to Replace all 0’s with 1 in a given integer

import java.util.Scanner;
public class Day_23 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.print("Enter a number having 0 in it : ");
	try{
		num=sc.nextInt();
	}catch(Exception e){
		System.out.print("Only positive integer value accepted.\n"+e);
		return;
	}
	//310020
	String SNum=String.valueOf(num);
        int l=SNum.length();
	String CNum="";

	for(int i=0;i<l;i++)
	{
		if(SNum.charAt(i)=='0')
		{
			CNum+="1";
		}else
		{
			CNum+=(""+SNum.charAt(i));
		}
		
	}
	  System.out.println(CNum);
	
	sc.close();
}
}