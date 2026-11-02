package assignment3;
import java.util.Scanner;
public class Assignment3_Qn6_palindrome_number_checker {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is a palindrome: ");
        int palin = input.nextInt();
        if (palin / 100 == palin % 10)
            System.out.println( palin + " is a palindrome");
        else
            System.out.println(palin + " is not a palindrome");
    }
}
