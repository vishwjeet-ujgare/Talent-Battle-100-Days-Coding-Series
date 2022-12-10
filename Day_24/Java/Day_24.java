import java.util.Scanner;

/*
Day 24 coding Statement :
 Write a program to print Pyramid pattern using stars
Input
4
Output
   *
  ***
 *****
 
*/
public class Day_24 {
    public static void main(String args[]) {
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row numbes : ");
        try {
            row = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter positive Integer  number only :\n" + e + "\nThank You...\nexited ");
            return;
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row + (row - 1); j++) {
                int startPrint = row - (i - 1);
                int stillPrint = startPrint + (i + (i - 1));
                if ((startPrint <= j) && (stillPrint > j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
