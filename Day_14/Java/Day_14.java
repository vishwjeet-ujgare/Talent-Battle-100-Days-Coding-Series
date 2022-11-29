//  Day 14 coding Statement : 
//     Write a program to reverse a given number

import java.util.Scanner;
class Main
    {
        public static void main (String args[])
        {
            System.out.print("Enter any number : ");
            Scanner sc=new Scanner(System.in);
            
            int num=sc.nextInt();
            
            int temp=num;
            int rev=0;
            
             while(num>0)
             {
                 int rem=num%10;        //give us last digit
                 rev=rem +rev*10 ;   //this update reverse variable 
                 num =num/10;       //update number by excluding last number 
             } 
            System.out.println("Reverse of a "+temp+" = "+rev);
            
            
        }
    }
    //  Day 14 coding Statement : 
//     Write a program to reverse a given number

import java.util.Scanner;
class Main
    {
        public static void main (String args[])
        {
            System.out.print("Enter any number : ");
            Scanner sc=new Scanner(System.in);
            
            int num=sc.nextInt();
            
            int temp=num;
            int rev=0;
            
             while(num>0)
             {
                 int rem=num%10;        //give us last digit
                 rev=rem +rev*10 ;   //this update reverse variable 
                 num =num/10;       //update number by excluding last number 
             } 
            System.out.println("Reverse of a "+temp+" = "+rev);
            
            
        }
    }
//  Day 14 coding Statement : 
//     Write a program to reverse a given number

import java.util.Scanner;
class Day_14
    {
        public static void main (String args[])
        {
            System.out.print("Enter any number : ");
            Scanner sc=new Scanner(System.in);
            
            int num=sc.nextInt();
            
            int temp=num;
            int rev=0;
            
             while(num>0)
             {
                 int rem=num%10;        //give us last digit
                 rev=rem +rev*10 ;   //this update reverse variable 
                 num =num/10;       //update number by excluding last number 
             } 
            System.out.println("Reverse of a "+temp+" = "+rev);
            
            
        }
    }

