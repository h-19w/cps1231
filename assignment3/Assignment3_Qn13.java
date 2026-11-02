package assignment3;
import java.util.Scanner;
public class Assignment3_Qn13 {
    public static void main(String[]args) {
        System.out.println("Enter three points for p0, p1, and p2: ");
        Scanner input = new Scanner (System.in);
        double xp0 = input.nextDouble();
        double yp0 = input.nextDouble();
        double xp1 = input.nextDouble();
        double yp1 = input.nextDouble();
        double xp2 = input.nextDouble();
        double yp2 = input.nextDouble();
        int output1 = (int)((xp1 - xp0) * (yp2 - yp0) - (xp2 - xp0) * (yp1 - yp0));
        if(output1 > 0)
            System.out.println("p2 is on the left side of the line");
        else if (output1 == 0)
            System.out.println("p2 is on the same line");
        else
            System.out.println("p2 is on the right side of the line");
    }
}

