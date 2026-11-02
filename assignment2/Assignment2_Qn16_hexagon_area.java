package assignment2;
import java.util.Scanner;

public class Assignment2_Qn16_hexagon_area {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the side");
        double length = input.nextDouble();
        double area =( 3 * Math.pow(3, 0.5)) / 2 * Math.pow(length, 2);
        System.out.println("The area of the hexagon is "+ area);
    }
}
