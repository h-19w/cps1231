package assignment2;
import java.util.Scanner;

public class Assignment2_Qn17_triangle_area {
    public static void main(String[] args) {
        double x1,y1;
        double x2,y2;
        double x3,y3;
        double lengthside1,lengthside2,lengthside3;
        double halfsumlengthside,areatriangle;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value for x1");
        x1 = input.nextDouble();
        System.out.print("Enter the value for y1");
        y1 = input.nextDouble();
        System.out.print("Enter the value for x2");
        x2 = input.nextDouble();
        System.out.print("Enter the value for y2");
        y2 = input.nextDouble();
        System.out.print("Enter the value for x3");
        x3 = input.nextDouble();
        System.out.print("Enter the value for y3");
        y3 = input.nextDouble();
        lengthside1 = Math.pow(Math.pow( x2 - x1,2) + Math.pow(y2 - y1,2),0.5);
        lengthside2 = Math.pow(Math.pow( x3 - x1,2) + Math.pow(y3 - y1,2),0.5);
        lengthside3 = Math.pow(Math.pow( x3 - x2,2) + Math.pow(y3 - y2,2),0.5);
        halfsumlengthside = (lengthside1 + lengthside2 + lengthside3) / 2;
        areatriangle = Math.pow(halfsumlengthside *(halfsumlengthside -lengthside1 ) *
                (halfsumlengthside - lengthside2 ) * (halfsumlengthside - lengthside3), 0.5);
        System.out.println("The area of the triangle is" + areatriangle);

    }
}
