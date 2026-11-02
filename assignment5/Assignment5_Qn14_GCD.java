package assignment5;
import java.util.*;
public class Assignment5_Qn14_GCD {
    public static void main(String[] args) {
        int number1, number2, GCD;
        System.out.println("Enter two integer numbers are separated by space: ");
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        number2 = input.nextInt();
        GCD = ((number1 > number2) ? number2 : number1);
        while (number1 % GCD != 0 || number2 % GCD != 0){
            GCD--;
        }
        System.out.println("The greatest common divisor for number1 and number2 is" + GCD);

    }
}



