package assignment2;
import java.util.Scanner;
public class Assignment2_Qn11_population {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double Born_Number = 1.0 / 7; //Birth of second
        final double Death_Number = 1.0 / 13; //Death of second
        final double Immigrant_Number = 1.0 / 45; //Immigrant of second
        final int Seconds_In_A_Year = 365 * 24 * 60 * 60;
        int PopulationNumberNow = 312_032_486;
        int year;

        System.out.println("Enter the number of years:  ");
        year = input.nextInt();
        int second_in_the_year = Seconds_In_A_Year * year;
        double YearPopulation = (int) (PopulationNumberNow + second_in_the_year * Born_Number
                - second_in_the_year * Death_Number + Immigrant_Number * second_in_the_year);
        System.out.println("The population in " + year + " year is " + YearPopulation);
    }
}