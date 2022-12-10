import java.util.Scanner;

public class Day_25 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter radius of a circle : ");
        float r=sc.nextFloat();
        
        final float pi=3.14f; 
        System.out.println("Area of a given circle is : "+pi*r*r);


        

        sc.close();
    }
}
