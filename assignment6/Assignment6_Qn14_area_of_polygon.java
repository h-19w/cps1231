package assignment6;
import java.util.Scanner;

public class Assignment6_Qn14_area_of_polygon {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.println("Enter one length of the sides: ");
        double side = input.nextDouble();
        System.out.println("the area of the polygon is: " + area(n,side));
    }
    public static double area(int n,double side) {
        double result1 = (n * side * side);
        double result2 = 4 * (Math.tan(Math.PI / n));
        double result = result1 / result2;
        return result;
    }
}
