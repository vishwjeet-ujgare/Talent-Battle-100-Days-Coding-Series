import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Day_18 {
    public static void main(String[] args) {
        int x1, y1, x2, y2, x3, y3;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            System.out.print("Enter Values for x" + i + " and y" + i + " separated by space :");

            BufferedReader BIS = new BufferedReader(new InputStreamReader(System.in));
            String[] twoNums = new String[2];

            try {
                twoNums = BIS.readLine().split(" ");
                arr.add(Integer.parseInt(twoNums[0]));
                arr.add(Integer.parseInt(twoNums[1]));
            } catch (Exception e) {
                System.out.println("Please Enter numeric value separed by one space only \n" + " Error" + e);
                return;
            }
        }

        x1 = arr.get(0);
        y1 = arr.get(1);
        x2 = arr.get(2);
        y2 = arr.get(3);

        x3 = (x1 * y2) + (x2 * y1);
        y3 = (y1 * y2);

        int temp;
        if (x3 > y3) {
            temp = x3;

        } else {
            temp = y3;
        }

        for (int i=temp;i>0;i--)
        {
            if(x3%i==0 && y3%i==0)
            {
                x3=x3/i;
                y3=y3/i;
            }
        }
        System.out.println(x3 + "/" + y3);

    }
}