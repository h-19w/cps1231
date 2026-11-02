package assignment2;
import java.util.Scanner;
public class Assignment2_Qn12_planerunwaylength_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed in meters/second (m/s) and the acceleration a in meters/second squared : ");
        double v = input.nextDouble();
        double a = input.nextDouble();

        double length = Math.pow(v,2) /( 2 * a);
        System.out.println("The minimum runway length for this airplane is " + length);

    }
}
