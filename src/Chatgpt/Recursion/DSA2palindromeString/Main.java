package Chatgpt.Recursion.DSA2palindromeString;
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the String:  ");
    String str = input.nextLine();
    int left =0;
    int right = str.length()-1;
    System.out.println( Ispalindrome(str, left,right));
   } 
   public static boolean Ispalindrome(String str,int left,int right){
    if(left>=right)
        return true;
    if(str.charAt(left)==str.charAt(right))
        return Ispalindrome(str, left+1, right-1);
else 
    return false;
   }
}
