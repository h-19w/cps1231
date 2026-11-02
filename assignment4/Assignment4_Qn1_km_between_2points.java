package assignment4;
import java.util.Scanner;

public class Assignment4_Qn1_km_between_2points {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());

        Scanner input2 = new Scanner (System.in);
        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = Math.toRadians(input2.nextDouble());
        double y2 = Math.toRadians(input2.nextDouble());

        double radius = 6371.01;

        double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("The distance between the two points is " + d + " km");
    }
}
// 39.55 −116.25 41.5 87.37
// 10691.79183231593 km