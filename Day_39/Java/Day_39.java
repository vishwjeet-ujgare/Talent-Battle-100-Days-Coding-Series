import java.util.Scanner;

public class Day_39 {
    public static void main(String args[]) {
        System.out.print("Enter only two strings separated by space : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String strs[] = str.split(" ");

        if (strs.length > 2) {
            System.out.println("please Enter two words ...");
            return;
        }

        char ch1[] = strs[0].toUpperCase().toCharArray();
        char ch2[] = strs[1].toUpperCase().toCharArray();

        int strl1 = strs[0].length();
        int strl2 = strs[1].length();

        if (strl1 == strl2) {
            for (int i = 0; i < strl1; i++) {
                for (int j = 0; j < strl2; j++) {
                    if (ch1[i] == ch2[j]) {
                        ch2[j] = '-';
                        break;
                    }
                }

            }

        }


        boolean isAnagram=false;
        for (char c : ch2) {
            if (c == '-') {
                isAnagram=true;
            } else {
                isAnagram=false;
                break;
            }
        }

        if(isAnagram)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("not Anagram");
        }
        
    }
}