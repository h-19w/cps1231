package assignment2;
import java.util.Scanner;

public class Assignment2_Qn1_mToKm {
    public static void main(String[]args){
//       1 mile = 1.6 kilometers
        System.out.println("This is a conversion of miles to kilometers");
        System.out.println("Please enter miles : ");
        double mile;
        double kilometers;
        Scanner input = new Scanner(System.in);
        mile = input.nextDouble();
        kilometers  = mile * 1.6;
        System.out.println(mile + " miles is equal to " + kilometers + " kilometers");
    }
}
