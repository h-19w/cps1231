package assignment3;
import java.util.Scanner;
public class Assignment3_Qn12_check_if_2rect_overlap {
    public static void main(String[]args) {
        System.out.println("Enter rectangle 1’s center x and y coordinates, width, and height: ");
        Scanner input = new Scanner (System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        System.out.println("Enter rectangle 2’s center x and y coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        if(width1 * height1 >= width2 * height2)
        {
            if((x2 - width2 / 2 >= x1 - width1 / 2 && x2 -width2 / 2 <= x1 + width1 /2 && y2 + height2 / 2 >= x1 - height1 /2 && y2 + height2 /2 <= y1 + height1 / 2)
                    && (x2 - width2 / 2 >= x1 - width1 /2 && x2 - width2 / 2 <= x1 + width1 / 2&& y2 - height2 / 2 >= y1 - height1 / 2 && y2 - height2 /2 <= y1 + height1 /2)
                    && (x2 + width2 / 2 >= x1 - width1 / 2 && x2 + width2 /2 <= x1 + width1 /2 && y2 + height2 / 2 >= y1 - height1 / 2 && y2 + height2 / 2 <= y1 + height1 / 2)
                    && (x2 + width2 /2 >= x1 - width1 / 2 && x2 + width2 /2 <= x1 +  width1 / 2 && y2 - height2 /2 >= y1 - height1 /2 && y2 - height2 /2 <= y1 + height1 / 2))
            {
                System.out.println("Rectangle 2 is inside Rectangle 1");
            }
            else if ((x2 - width2 / 2 >= x1 - width1 / 2 && x2 -width2 / 2 <= x1 + width1 /2
                    && y2 + height2 / 2 >= x1 - height1 /2 && y2 + height2 /2 <= y1 + height1 / 2)
                    || (x2 - width2 / 2 >= x1 - width1 /2 && x2 - width2 / 2 <= x1 + width1 / 2&& y2 - height2 / 2 >= y1 - height1 / 2 && y2 - height2 /2 <= y1 + height1 /2)
                    || (x2 + width2 / 2 >= x1 - width1 / 2 && x2 + width2 /2 <= x1 + width1 /2 && y2 + height2 / 2 >= y1 - height1 / 2 && y2 + height2 / 2 <= y1 + height1 / 2)
                    || (x2 + width2 /2 >= x1 - width1 / 2 && x2 + width2 /2 <= x1 +  width1 / 2 && y2 - height2 /2 >= y1 - height1 /2 && y2 - height2 /2 <= y1 + height1 / 2))
            {
                System.out.println("Rectange 2 overlaps Rectangle 1");
            }
            else
            {
                System.out.println("Rectangle 2 does not overlap Rectangle 1");
            }
        }
        else
        {
            if ((x1 - width1 / 2 >= x2 - width2 / 2  && x1 -width1 / 2 <= x2 + width2 /2
                    && y1 + height1 / 2 >= x2 - height2 /2 && y1 + height1 /2 <= y2 + height2 / 2)
                    && (x1 - width1 / 2 >= x2 - width2 /2 && x1 - width1 / 2 <= x2 + width2 / 2&& y1 - height1 / 2 >= y2 - height2 / 2 && y1 - height1 /2 <= y2 + height2 /2)
                    && (x1 + width1 / 2 >= x2 - width2 / 2 && x1 + width1 /2 <= x2 + width2 /2 && y1 + height1 / 2 >= y2 - height2 / 2 && y1 + height1 / 2 <= y2 + height2 / 2)
                    && (x1 + width1 /2 >= x2 - width2 / 2 && x1 + width1 /2 <= x2 +  width2 / 2 && y1 - height1 /2 >= y2 - height2 /2 && y1 - height1 /2 <= y2 + height2 / 2))
            {
                System.out.println("Rectangle 1 is inside Rectangle 2");
            }
            else if
            ((x1 - width1 / 2 >= x2 - width2 / 2  && x1 -width1 / 2 <= x2 + width2 /2
                            && y1 + height1 / 2 >= x2 - height2 /2 && y1 + height1 /2 <= y2 + height2 / 2)
                            || (x1 - width1 / 2 >= x2 - width2 /2 && x1 - width1 / 2 <= x2 + width2 / 2&& y1 - height1 / 2 >= y2 - height2 / 2 && y1 - height1 /2 <= y2 + height2 /2)
                            || (x1 + width1 / 2 >= x2 - width2 / 2 && x1 + width1 /2 <= x2 + width2 /2 && y1 + height1 / 2 >= y2 - height2 / 2 && y1 + height1 / 2 <= y2 + height2 / 2)
                            || (x1 + width1 /2 >= x2 - width2 / 2 && x1 + width1 /2 <= x2 +  width2 / 2 && y1 - height1 /2 >= y2 - height2 /2 && y1 - height1 /2 <= y2 + height2 / 2))
            {
                System.out.println("Rectangle 1 overlaps Rectangle 2");
            }
            else
            {
                System.out.println("Rectangle 1 does not overlap Rectangle 2");
            }
        }
    }
}