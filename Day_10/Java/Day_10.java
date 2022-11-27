// Day 10 coding Statement: 
// Write a program to find Factorial of a number

import java.util.Scanner;

public class Day_10 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Number : ");
      int num = sc.nextInt();

      if (num == 0) {
         System.out.println("Factorial of " + num + " : 1");
         sc.close();
         return;
      }

      int temp = num;
      int fact = 1;
      
      for (int i = num; i >= 1; i--) {
         fact = fact * i;
      }
      System.out.println("Factorial of number " + temp + " : " + fact);
      sc.close();
   }
}
