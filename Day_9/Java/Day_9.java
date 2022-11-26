//Day 9 coding Statement : 
//Write a program to find Number of digits in an integer

import java.util.Scanner;
public class Day_9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any natural number : ");
        int num = sc.nextInt();
        int temp = num;

        int count = 0;

        while (num > 0) {
            num = num / 10;
            count += 1;
        }
        System.out.println("Number of Digits in " + temp + " : " + count);

        sc.close();

    }

}
