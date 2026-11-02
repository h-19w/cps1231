package assignment2;
import java.util.Scanner;
public class Assignment2_Qn10_energy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        System.out.println("Enter the initial temperature: ");
        System.out.println("Enter the final temperature: ");

        double weight_of_water = input.nextDouble(); // WEIGHT IN KG
        double initial_temperature = input.nextDouble();
        double Final_temperature = input.nextDouble();

        double energy = weight_of_water * (Final_temperature - initial_temperature ) * 4184;
        //energy is measured in joules.
        System.out.println("The energy needed is " + energy);

    }
}
