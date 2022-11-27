
/*
Day 8 coding Statement:
             Write a program to find roots of a quadratic equation
Description :
            Get the values of a, b and c (coefficients of quadratic equation)
as input from the user and calculate the roots and print as the output.
Input : Enter the value of a, b and c: I -6 9
Output: Roots are equal
        Root1= root 2 = 3.00
*/
import java.util.Scanner;

import java.lang.Math;

public class Day_8 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for a ,b and c :");

        // taking values for a ,b and c
        System.out.print("a = ");
        double a = sc.nextFloat();

        System.out.print("b = ");
        double b = sc.nextFloat();

        System.out.print("c = ");
        double c = sc.nextFloat();

        // finding Discriminant D=b*b-(4*a*c)
        double D = (b * b) - (4 * a * c);
        
        // check valus for Discriminant and find out roots

        double r1, r2;
        if (D == 0) {
            System.out.println("Roots are Real and Equal");
            r1 = r2 = -b / (2 * a);
            System.out.println("root 1 =root 2 = " + r1);
        } else if (D > 0) {
            System.out.println("Roots are Real and Distinct");
            r1 = (-b + Math.sqrt(D)) / (2 * a);
            r2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("root 1 = " + r1 + " , " + "root 2 = " + r2);
        } else if (D < 0) {
            System.out.println("Roots are Imaginary ");
            r1 = -b / (2 * a);
            r2 = Math.sqrt(-D) / (2 * a);
            System.out.println("root 1 = " + r1 + "+i" + r2 + " , " + "root 2 = " + r1 + "-i" + r2);
        }

        sc.close();
    }

}
