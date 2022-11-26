
// Day 7 coding Statement: 
// Write a program to find Number of days in a given month of a given year
/*
 * Jan =31 , Feb 28 if year is leap other wise 29
 * march=31, april=30, may=31, -, -, -,dec=31
 */
import java.util.Scanner;

public class Day_7 {

	public static void main(String args[]) {
		/*
		 * System.out.
		 * println(" Enter Month as \n Jan = 1 \n Feb = 2 \n mar = 3\n - \n - \n Dec=12\n"
		 * );
		 * System.out.println("Enter year in 4 digit only");
		 * System.out.println("-------------------------");
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Month Number : ");
		int month = sc.nextInt();

		System.out.print("Enter Year : ");
		int year = sc.nextInt();

		System.out.println("-------------------------");

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 9 || month == 11) {
			System.out.println("Number of Days in (" + month + "," + year + ") = " + 31);
		} else if (month == 4 || month == 6 || month == 8 || month == 10 || month == 12) {
			System.out.println("Number of Days in (" + month + "," + year + ") = " + 30);
		} else if (month == 2) {

			if ((year % 400 == 0) && (year % 4 == 0)) {
				System.out.println("Number of Days in (" + month + "," + year + ") = " + 29);
			} else {
				System.out.println("Number of Days in (" + month + "," + year + ") = " + 28);
			}

		}
		sc.close();

	}
}
