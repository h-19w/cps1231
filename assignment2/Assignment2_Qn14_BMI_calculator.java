package assignment2;
import java.util.Scanner;

public class Assignment2_Qn14_BMI_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pound,inches, kg, meters, BMI;

        System.out.print("Enter weight in pounds: ");
        pound = input.nextDouble();

        System.out.print("Enter height in inches: ");
        inches = input.nextDouble();

        kg = pound *  0.45359237;
        meters = inches * 0.0254;
        BMI = kg / Math.pow(meters, 2);
        System.out.println("BMI is" + BMI);

    }
}
