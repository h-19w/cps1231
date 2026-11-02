package assignment2;
import java.util.Scanner;

public class Assignment2_Qn3_nTofeet {
    public static void main(String[]args ){
//        One meter is 3.2786 feet.
        System.out.println("This is a conversion of miles to feet");
        System.out.println("Please enter miles : ");
        double mile;
        double feet;
        Scanner input = new Scanner(System.in);
        mile = input.nextDouble();
        feet  = mile * 3.2786;
        System.out.println(mile + " miles is equal to " + feet + " feet");

    }
}
