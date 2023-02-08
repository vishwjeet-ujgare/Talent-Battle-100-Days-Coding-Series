import java.util.Scanner;
// import java.lang.String;

public class Day_34 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an algebraic expression having brackets : ");
        String str=sc.next();

        // [()] character from the options between the brackets
        String finalStr=str.replaceAll("[()]","");
        System.out.println(finalStr);
}
}
