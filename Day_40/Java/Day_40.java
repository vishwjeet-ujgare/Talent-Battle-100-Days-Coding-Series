import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class Day_40 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String mainString=sc.next();

        System.out.print("Enter a substring to be removed : ");
        String removeIt=sc.next();

        System.out.print("Enter a new substring  to replaced :  ");
        String replacedIt=sc.next();

    //  take simple string 
        String newString = mainString.replace(removeIt, replacedIt);

        // take regex string 
        // String newString = mainString.replace(removeIt, replacedIt);s
        System.out.println("The new String : "+newString);
    }
}
