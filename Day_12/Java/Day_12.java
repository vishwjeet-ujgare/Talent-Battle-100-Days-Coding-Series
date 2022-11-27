// Day 12 coding Statement: 
// Write a program to find Sum of digits of a number
import java.util.Scanner;
public class Day_12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int temp=num;
        
        int sum=0;
        while(num>0)
        {
            int rem=num%10;
            num=num/10;
            sum +=rem;
        }
        
        System.out.println("Sum of digits of a number "+temp+" is "+sum);
        sc.close();
    }
}
