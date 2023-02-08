import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Day_35
{
    public static void main(String args[])
    {
        System.out.print("Enter a String having numbers in it : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        //created pattern
        Pattern pattern=Pattern.compile("\\d");
        //matches with string 
        Matcher m = pattern.matcher(str);
        int sum=0;
        //if mathed
        while(m.find())
        {
            sum=sum+Integer.parseInt(m.group(0));
            // System.out.println(m.group(0));
        }
        System.out.println(sum);
    }
}