/* 
Day 2 coding Statement: Write a program to identify if 
the character is an alphabet or not.

Description: Take an input character from user and check whether it is an alphabet or not.
Input : A
Output:  Alphabet

Input: 7
Output: Not an alphabet
*/
import java.util.Scanner;

public class Day_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");

        char ch = sc.next().charAt(0);

        if (Character.isAlphabetic(ch)) {
            System.out.println(ch + " is an Alphabet");
        } else {
            System.out.println(ch + " is not an Alphabet");
        }
        sc.close();
    }
}