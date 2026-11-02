package assignment6;
import java.util.Scanner;
public class Assignment6_Qn1_summation {
    public static void main(String[] args) {
            int number;
            Scanner inputScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            number = inputScanner.nextInt();
            System.out.printf("The sum of the digits in %d is %d", number, sumDigits(number));
    }
    public static int sumDigits(int n) {
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
