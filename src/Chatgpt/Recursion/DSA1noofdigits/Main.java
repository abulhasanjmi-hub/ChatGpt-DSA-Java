package Chatgpt.Recursion.DSA1noofdigits;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        System.out.println("Total number of digits in number:"+Coutingdigits(num));
    }

public static int Coutingdigits(int num){
if(num<10)
    return 1;
else 
    return 1+Coutingdigits(num/10);
}
}