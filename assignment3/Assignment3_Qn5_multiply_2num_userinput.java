package assignment3;
import java.util.Scanner;

public class Assignment3_Qn5_multiply_2num_userinput {
    public static void main(String[]args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " * " + number2 + " * " + "? ");
        int answer = input.nextInt();
        System.out.println(number1 + " * " + number2 + " = " + answer + " is " + (number1 * number2 == answer));
        System.out.println("The answer is: " + (number1 * number2));
    }
}
