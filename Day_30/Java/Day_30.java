import java.util.Scanner;

public class Day_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int count = 0;
        for (char ch : str.toCharArray()) {
            count++;
    }
    System.out.println(count);
  sc.close();
}
}
