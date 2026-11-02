package assignment4;
import java.util.Scanner;
public class Assignment4_Qn4_pentagon_coordinates {
    public static void main(String[]args ) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle of the pentagon: ");
        double radius = input.nextDouble();
        input.close();

        System.out.println("The coordinates of five points on the pentagon are...");
        for (int i = 0; i < 5; i++) {

            double x = (radius * Math.sin(2.0 * Math.PI / 5.0 * i));

            double y = (radius * Math.cos(2.0 * Math.PI / 5.0 * i));

            System.out.printf("( %.2f ", x);
            System.out.print(",");
            System.out.printf(" %.2f ", y);
            System.out.print(") ");
            System.out.println();

        }
    }
}
