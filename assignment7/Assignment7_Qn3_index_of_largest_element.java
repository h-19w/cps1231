package assignment7;
import java.util.Scanner;
public class Assignment7_Qn3_index_of_largest_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers ");
        double []numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number #" + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }
        int indexOfLargest = indexoflargestelements(numbers);
        System.out.println("Index of the largest element: " + indexOfLargest);
        System.out.println("Value of the largest element: " + numbers[indexOfLargest]);
    }
    public static int indexoflargestelements(double[]array) {
        double max = array[0];
        int indexofmax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexofmax = i;
            }
        }
        return indexofmax;
    }
}
