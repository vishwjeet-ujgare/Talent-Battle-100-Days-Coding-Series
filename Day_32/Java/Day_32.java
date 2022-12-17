
// Day 32 coding Statement :
//  Write a Program to Remove vowels from a string
import java.util.Scanner;

public class Day_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(removeVowel(str));
        
    }

    public static String removeVowel(String str) {
        String withoutVowel="";
        for (char ch : str.toCharArray()) {
            if (!isVowel(ch)) {
               withoutVowel+=ch;
            }
        }
        return withoutVowel;
    }

    public static boolean isVowel(char ch) {
        char [] arr={'a','e','i','o','u'};
        boolean isVowel=false;
        for(int i =0;i<arr.length;i++)
        {
            if(ch == arr[i])
            {
                isVowel=true;
                break;
            }
        }
        return isVowel;
    }
}
