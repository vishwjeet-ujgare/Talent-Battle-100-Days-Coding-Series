import java.util.Scanner;
class Day_4
{
    public static void main (String args[])
    {
        
        System.out.print("Enter an integer number : ");
      
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        if(num==0)
        {
            System.out.println("Neither positive nor negative");
        }
        else if(num>0)
        {
            System.out.println("Positive number ");
        }
        else if(num<0)
        {
            System.out.println("Negative number ");
            
        }
        sc.close();
    }
}