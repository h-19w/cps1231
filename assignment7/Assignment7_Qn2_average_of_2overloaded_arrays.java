package assignment7;
import java.util.Scanner;
public class Assignment7_Qn2_average_of_2overloaded_arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers ");
        double []numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number #" + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }
        System.out.println("The average is " + average(numbers));
    }
    public static double average(double[] array) {
        double total = 0;
        for(int i =0;i < array.length;i++) {
            total += array[i];
        }
        double n = total / array.length;
        return n;
    }
}
