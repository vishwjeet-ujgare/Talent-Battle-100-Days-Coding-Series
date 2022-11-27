import java.util.Scanner;

public class Day_10_By_Recursion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter positive number : ");
        int num = sc.nextInt();

        System.out.print("Factorial of a given number  is " + findFact(num));
        sc.close();
    }

    public static int findFact(int num) {

        if(num==0)
        {
            return 1;
        }

        return num*findFact(num-1);
    }
}
