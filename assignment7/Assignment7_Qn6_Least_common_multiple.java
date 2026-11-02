package assignment7;
import java.util.Scanner;
public class Assignment7_Qn6_Least_common_multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers");
        int [] numbers = new int [5];
        for (int i = 0;i <5;i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        int result = LCM(numbers);
        System.out.println("The result is " + result);
    }
    public static int LCM(int...numbers) {
        if(numbers.length == 0) {
            System.out.print("WRONG");
        }
        int result = numbers[0];
        for(int i = 1; i< numbers.length; i++) {
            result = calculateLCM(result,numbers[i]);
        }
        return result;
    }
    public static int calculateLCM(int a,int b){
        return Math.abs(a * b) / calculateGCD(a,b);
    }
    public static int calculateGCD(int a,int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
