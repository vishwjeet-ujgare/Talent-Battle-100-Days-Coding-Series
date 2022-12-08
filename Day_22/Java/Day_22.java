
// Day 22 coding Statement : 
// Write a program to express a number as a sum of two prime numbers
import java.util.Scanner;

public class Day_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 3; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {

                for (int k = i; k <= num; k++) {
                    boolean isPrime1 = true;
                    for (int l = 2; l <= k / 2; l++) {
                        if (k % l == 0) {
                            isPrime1 = false;
                            break;
                        }
                    }
                    if (isPrime1 && (i + k == num)) {
                        System.out.println(num + " can be expressd as " + i + " + " + k + " = " + num);
                    }
                }
            }
        }
        sc.close();

    }
}
