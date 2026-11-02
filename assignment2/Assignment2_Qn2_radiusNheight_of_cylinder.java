package assignment2;
import java.util.Scanner;

public class Assignment2_Qn2_radiusNheight_of_cylinder {
    public static void main(String[]args){
        double volume;
        double area;
        double radius;
        double height;
        final double π = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius and height of the cylinder(separated by a space).");
        radius = input.nextDouble();
        height = input.nextDouble();
        area = radius * radius * π;
        volume = area * height ;
        System.out.println("the area is : " + area);
        System.out.println("the volume is : " + volume);
    }
}
