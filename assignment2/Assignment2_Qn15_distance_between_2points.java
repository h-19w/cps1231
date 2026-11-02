package assignment2;
import java.util.Scanner;

public class Assignment2_Qn15_distance_between_2points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values for x1 and x2: ");
        System.out.println("Enter the values for y1 and y2: ");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance =Math.pow(Math.pow( x2 - x1,2) + Math.pow(y1 - y2,2),0.5);
        System.out.println("The distance between the two points is " + distance);
    }
}
