
// Day 6 coding Statement:
// Write a program to find the Quadrants in which coordinates lie
import java.util.Scanner;

public class Day_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Values in number i.e in positive / negative");
        System.out.println("------------------------------------------");

        System.out.print("Enter X coordinate : ");
        int x = sc.nextInt();

        System.out.print("Enter Y coordinate : ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("points (" + x + "," + y + ") lies in first quadrant.");
        } else if (x < 0 && y > 0)// - +
        {
            System.out.println("points (" + x + "," + y + ") lies in second quadrant.");

        } else if (x < 0 && y < 0)// - -
        {
            System.out.println("points (" + x + "," + y + ") lies in Third quadrant.");

        } else if(x>0 && y<0)//+ -
        {
            System.out.println("points ("+x+","+y+") lies in Fourth quadrant.");

        }
        else if(x==0 && (y>0 || y<0))//0  and (+ or -)
        {
            System.out.println("points ("+x+","+y+") lies on y axis.");

        }
        else if(y==0 && (x>0 || x<0))
        {
            System.out.println("points ("+x+","+y+") lies on x axis.");

        }
        else if (y==0 && x==0)
        {
            System.out.println("points ("+x+","+y+") lies on origin.");
        }

        sc.close();
    }

}
