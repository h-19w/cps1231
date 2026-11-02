package assignment3;
import java.util.Scanner;

public class Assignment3_Qn9_shipping_cost_calculator {
    public static void main(String[]args) {
        double winp;
        System.out.println("Enter weight in pounds : ");
        Scanner input = new Scanner(System.in);
        winp = input.nextDouble();
        if(winp > 0 && winp <= 2)
            System.out.println("The shipping cost is $ 2.5");
        else if (winp > 2 && winp <= 4)
            System.out.println("The shipping cost is $ 4.5");
        else if (winp > 4 && winp <= 10)
            System.out.println("The shipping cost is $ 7.5");
        else if (winp > 10 && winp <= 20)
            System.out.println("The chipping cost is $ 10.5");
        else if(winp < 0)
            System.out.println("Error. please type the correct weight again.");
        else if (winp > 20)
            System.out.println("Sorry we do not ship items of this weight. ");
    }
}
