package assignment7;
import java.util.Scanner;

public class Assignment7_Qn13_pattern_recognition_4eqnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int num = input.nextInt();
        int[] numbers = new int[num];
        System.out.print("Enter values: ");
        for(int i =0;i < num;i++) {
            numbers[i] = input.nextInt();
        }
        if (isConsecutiveFour(numbers)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }
    public static boolean isConsecutiveFour(int[]values) {
        int count = 1;
        for(int i =1; i< values.length;i ++) {
            if(values[i] == values[i-1]) {
                count++;
                if(count ==4) {
                    return true;
                }
            }
            else {
                count =1;
            }
        }
        return false;
    }
}
