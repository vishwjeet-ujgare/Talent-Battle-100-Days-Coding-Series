import java.util.Scanner;
import java.lang.Math;

public class Day_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // using predefined function
        // System.out.println(Math.addExact(num, num));
        System.out.println(add(num));
        sc.close();
    }

    // using function
    public static int add(int num) {
        int add = num;
        for (int i = 0; i < num; i++) {
            add++;
        }
        return add;
    }
}
