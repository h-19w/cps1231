package assignment2;
import java.util.Scanner;

public class Assignment2_Qn5_tip_calculator {
    public static void main(String[]args){
//        Write a program that reads the subtotal and the gratuity rate and
//        then computes the gratuity and total. For example,
//        if the user enters 10 for subtotal and 12% for gratuity rate,
//        the program displays $1.2 as gratuity and $11.2 as total.
        System.out.println("This is a calculation of tips?");
        System.out.println("Please enter the subtotal and a gratuity rate: ");
        double subtotal;
        double grav_rate;
        double total;
        double gravity;
        Scanner input = new Scanner(System.in);
        grav_rate = input.nextDouble();
        subtotal = input.nextDouble();
        gravity = 0.01 * subtotal * grav_rate;
        total = grav_rate * subtotal;
        System.out.println("the gratutiy is equal to: " + gravity + "and the Total is: " + total);

    }
}
