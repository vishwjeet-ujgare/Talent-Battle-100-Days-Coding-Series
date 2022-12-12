import java.util.Scanner;

class Day_26 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Persons : ");
        int N = sc.nextInt();
        int HandShake = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                HandShake += 1;
            }
        }

        System.out.println("Total Handshake for "+N+" People are "+HandShake);

    }
}