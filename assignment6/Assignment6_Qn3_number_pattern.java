package assignment6;
import java.util.Scanner;
public class Assignment6_Qn3_number_pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int result = input.nextInt();
        System.out.println();
        DisplayPattern(result);
    }

    public static void DisplayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
