package assignment4;
import java.util.Scanner;

public class Assignment4_Qn5_binary_to_decimal {
    public static void main(String[]args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number from [0000 to 1111]: ");
        String binaryString = String.valueOf(input.next());
        int decimal = Integer.parseInt(binaryString,2);
        System.out.println("The decimal value is: " + decimal);
    }
}
