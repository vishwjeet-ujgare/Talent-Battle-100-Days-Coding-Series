
// Day 11 coding Statement: 
// Write a to find Fibonacci series up to n
import java.util.Scanner;

public class Day_11 {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number : ");
    int temp = sc.nextInt();
    int num=temp-2;

    int a = 0;
    int b = 1;

    System.out.println("Fibonacci Series Upto " + temp + " are : ");
    System.out.print(a + " " + b);

    for (int i = 0; i < num; i++) {
      // swapping logic
      int c = a + b;
      System.out.print(" " + c);
      a = b;
      b = c;
    }
    sc.close();

  }
}
