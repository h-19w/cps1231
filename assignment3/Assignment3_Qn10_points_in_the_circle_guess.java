package assignment3;
import java.util.*;
public class Assignment3_Qn10_points_in_the_circle_guess {
    public static void main(String[]args) {
        System.out.println("Enter a point with x and y coordinates: ");
        Scanner input = new Scanner(System.in);
        double x1,x2,y1,y2,distance;
        x1 = 0;
        y1 = 0;
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        distance = Math.pow(Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2) , 0.5);
        if (distance < 10)
            System.out.println("point (" + x2 + "," + y2 + ") is in the circle");
        else
            System.out.println("point (" + x2 + "," + y2 + ") is not in the circle");
    }
}
