
// Day 19 coding Statement :
// Write a program to identify if the number is Armstrong number or not
import java.util.Scanner;
public class Day_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Number : ");
        int num;
        int temp;
        try {
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter numeric value only \n" + e);
            sc.close();
            return;
        }
        int l = 0;
        /*
         * String temp=String.valueOf(num);
         * l=temp.length();
         * System.out.println(l);
         */
        temp = num;

        while (temp > 0) {
            temp = temp / 10;
            l += 1;
        }

        temp = num;
        int isArmstrong = 0;
        while (temp > 0) {
            int rem = temp % 10;
            int multi = 1;
            for (int i = 0; i < l; i++) {
                multi = multi * rem;
            }
            isArmstrong += multi;
            temp /= 10;
        }

        if (num == isArmstrong) {
            System.out.println(num + " is an armstrong number ");
        } else {
            System.out.println(num + " is Not an Armstrong number  ");
        }

        sc.close();
    }
}
