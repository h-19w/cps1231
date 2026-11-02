package assignment3;
import java.util.Scanner;

public class Assignment3_Qn14 {
    public static void main(String[]args) {

        System.out.println("Enter three points for p0, p1, and p2:");
        Scanner input = new Scanner (System.in);
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        int D1 = (int)((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));
        if(D1 == 0 && x2 <= (x0 > x1 ? x0 : x1) && x2 >= (x0 > x1 ? x1 : x0))
            System.out.println("(" + x2 + "," + y2 + ") is on the line segment from " + "(" + x0 + "," + y0 + ") to " + "(" + x1 + "," + y1 + ")");
        else
            System.out.println("(" + x2 + "," + y2 + ") is not on the line segment from " + "(" + x0 + "," + y0 + ") to " + "(" + x1 + "," + y1 + ")");
    }
}
