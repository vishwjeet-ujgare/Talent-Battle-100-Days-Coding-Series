// Day 21 coding Statement : 
// Write a program to identify if the number is Palindrome or not

import java.util.Scanner;;
public class Day_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num =sc.nextInt();
        
        int copy=num;
        int temp=0;
       
        while(copy!=0)
        {
            int rem=copy%10;
            temp=temp*10+rem;
            copy/=10;
        }

        if(temp==num)
        {
            System.out.println(num+" Number is Palindrome");
        }
        else{
            System.out.println(num+" Number is Not  Palindrome"); 
        }
        sc.close();
    } 
}
