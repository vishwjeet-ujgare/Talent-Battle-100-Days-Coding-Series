import java.util.Scanner;
public class Day_41 {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.print("Enter a string contains wildcard(* or ?) characters  : ");
	 String str=sc.nextLine();
	 
	 System.out.print("Enter a string : ");
	 String actualString=sc.nextLine();
	 
	 if(isMatch(str,actualString))
	 {
		 System.out.println("Yes they Match  ");
	 }
	 else
	 {
		 System.out.println("No..! they can't Match ");
	 }
 
	 
 } 
 
 
 public static boolean isMatch(String str1,String actualString)
 {
	 int s1l=str1.length();
	 int s2l=actualString.length();
	 
	 if(s1l ==s2l )
	 {
		for(int i=0;i<s1l;i++)
		{
			if(str1.charAt(i)==actualString.charAt(i) || str1.charAt(i)=='*' ||str1.charAt(i)=='?')
			{
				continue;
			}
			else
			{
				return false;
			}
		}
	 }
	 else
	 {
		 	return false; 
	 }
	
	return true;
	 
 }
}
