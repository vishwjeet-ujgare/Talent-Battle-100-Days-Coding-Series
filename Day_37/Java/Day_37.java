
// Day 37 coding Statement :
//  Write a Program to calculate the Frequency of characters in a string
import java.util.Scanner;

public class Day_37 {
    static char[] distincChar;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");

        String str = sc.next();
        char allCharInStr[] = str.toCharArray();
        int l = str.length();

        distincChar = new char[l];

        int j = 0;
        int k=0;
        for (char c : allCharInStr) {
            j += 1;
            int freq=1;
            if (!isPresent(c)) {
               for(int i=j;i<l;i++)
               {
                if(c==allCharInStr[i])
                {
                    freq+=1;
                }

               }

               System.out.println("Frequency for "+c+" is "+freq);
            }
            distincChar[k]=c;
            k++;
        }

    }

    public static boolean isPresent(char c) {

        for (int i = 0; i < distincChar.length; i++) {
            if (c == distincChar[i]) {
                return true;
            }
        }

        return false;
    }

}

