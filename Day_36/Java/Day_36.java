import java.util.Scanner;

public class Day_36 {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
int l=str.length();
        String mStr=str.substring(1,l-1);
    System.out.println(Character.toString(str.charAt(0)).toUpperCase()+mStr+Character.toString(str.charAt(l-1)).toUpperCase());

    }
}
