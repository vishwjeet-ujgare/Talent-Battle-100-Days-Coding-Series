import java.util.Scanner;

public class Day_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String to reverse it : ");
        String str = sc.nextLine();

        int l = str.length();
        String revStr = "";
        // hello=5
        for (int i = l - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        System.out.println(revStr);
    }
}
