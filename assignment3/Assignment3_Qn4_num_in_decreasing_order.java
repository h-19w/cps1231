package assignment3;
import java.util.Scanner;

public class Assignment3_Qn4_num_in_decreasing_order {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if (num1 <= num2) {
            if (num2 <= num3)
                System.out.print("decreasing order " + num3 + " " + num2 + " " + num1);
            if (num3 <= num1)
                System.out.print("decreasing order " + num2 + " " + num1 + " " + num3);
            else if (num3 <= num2)
                System.out.print("decreasing order " + num2 + " " + num3 + " " + num1);
        }
        else if (num3 > num1) {
            if (num3 <= num2)
                System.out.print("decreasing order " + num2 + " " + num3 + " " + num1);
            else if (num1 > num2)
                System.out.print("decreasing order " + num3 + " " + num1 + " " + num2);
        }
        else
            System.out.println("The numbers are in decreasing order = " + num1 + " " + num2 + " " + num3);
    }
}
