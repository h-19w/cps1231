package assignment2;
import java.util.Scanner;

public class Assignment2_Qn6_all_num_multiplier {
    public static void main(String[]args){
//        932 % 10 = 2 and 932 / 10 = 93
        System.out.print("please enter a number");
        Scanner input = new Scanner(System.in);
        int num_1 = input.nextInt();
        int num_2 = num_1 % 10; // the digit in the ones position
        System.out.println(num_2);
        int num_3 = num_1 / 10; //the first 2 digits, if any
        int num_0 = num_3 / 10;
        System.out.println(num_0);
        int num_4 = num_3 % 10;
        System.out.println(num_4);
        int total = num_2 * num_0 * num_4;
        System.out.println("the multiplication of all the digits in the given number is : " + total);
    }
}
