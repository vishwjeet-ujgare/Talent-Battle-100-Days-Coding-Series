import java.util.Scanner;

class Day_33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next();
        int l = str.length();
        String rev="";
        // noon
        for (int i = l-1 ; i >=0; i--) {
          
            rev +=Character.toString(str.charAt(i));
         

        }

        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");

            sc.close();
            
        }
    }
}