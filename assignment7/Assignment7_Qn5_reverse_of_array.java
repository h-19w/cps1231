package assignment7;
import java.util.Scanner;
public class Assignment7_Qn5_reverse_of_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        reverse(numbers);
        System.out.println("Reversed array:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }
    public static void reverse(double[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            double temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
