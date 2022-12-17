// Day 31 coding Statement : 
// Write a Program to Toggle each character in a string

import java.util.Scanner;
public class Day_31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(toggleCharacter(str));
        sc.close();
    }
    
    public static String toggleCharacter(String str)
    {
        int l=str.length();
        String returnStr="";
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if (Character.isUpperCase(ch))
            {
                returnStr+=Character.toLowerCase(ch);
            }
            else
            {
                returnStr+=Character.toUpperCase(ch);
            }
        }
        return returnStr;
    } 
}
