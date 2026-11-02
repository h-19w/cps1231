package assignment6;
import java.util.Scanner;
public class Assignment6_Qn2_reversed_number {
    public static void main(String[]args) {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = reverseNumber(num);
        System.out.print("The reverse of the given number is: "+ result);
    }
    public static int reverseNumber(int number) {
        int result = 0;
        while (number > 0){
            result = (result * 10 + number % 10);
            number /= 10;
        }
        return result;
    }
}

