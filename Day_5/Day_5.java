import java.util.Scanner;

class Day_5 {
    public static void main(String args[]) {
        System.out.print("Enter Integer Value : ");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num%2==0)
        {
            System.out.println("even"); 
        }
        else{

            System.out.println("Odd");
        }
       sc.close();
    }
}
