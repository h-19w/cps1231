package assignment2;
import java.util.Scanner;

public class Assignment2_Qn4_sqmTOping {
    public static void main (String[]args){
//      One square meter is 0.3025 ping.
        System.out.println("This is a conversion of square meters to ping");
        System.out.println("Please enter square meters : ");
        double sqm;
        double ping;
        Scanner input = new Scanner(System.in);
        sqm = input.nextDouble();
        ping  = sqm * 0.3025;
        System.out.println(sqm + " sqm is equal to " + ping + " pings");
    }
}
