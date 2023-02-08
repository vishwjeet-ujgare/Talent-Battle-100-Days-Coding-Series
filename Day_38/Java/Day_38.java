import java.util.Scanner;
import java.util.LinkedHashSet;

public class Day_38 {
  public static void main(String[] args) {
    
    LinkedHashSet<Character> set = new LinkedHashSet<>();
    System.out.print("Enter a string : ");

    Scanner sc=new Scanner(System.in);
    String str=sc.next();

    char allChar[]= str.toCharArray();

   
    for (char c : allChar) {
  set.add(Character.toLowerCase(c));
    }
     
    String withouRepating="";
    for (char c : set) {
        withouRepating+=Character.toString(c);
    }

    // System.out.println("String "+str+ "with Non-repeating characters : "+withouRepating);
System.out.println(withouRepating);  
}
}