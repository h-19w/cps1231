package assignment7;
import java.util.Scanner;

public class Assignment7_Qn11_array_sort_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list of numbers: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        if (isSorted(numbers)) {
            System.out.println("The list is sorted.");
        } else {
            System.out.println("The list is not sorted.");
        }
    }
    public static boolean isSorted(int[]list) {
        for(int i =1; i< list.length -1;i++) {
            if(list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
