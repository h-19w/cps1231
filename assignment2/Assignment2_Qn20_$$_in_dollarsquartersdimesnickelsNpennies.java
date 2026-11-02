package assignment2;
import java.util.Scanner;

public class Assignment2_Qn20_$$_in_dollarsquartersdimesnickelsNpennies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount in int :");
        int amount = input.nextInt();
        int remainingAmount = amount;

        int numberofonedollars = remainingAmount / 100;
        remainingAmount%= 100;
        int numberofquaters = remainingAmount / 25;
        remainingAmount%=25;
        int numberofdimes = remainingAmount / 10;
        remainingAmount%=10;
        int numberofnickels = remainingAmount / 5;
        remainingAmount%=5;
        int numberofpennies = remainingAmount;

        System.out.println("Your amount "+ amount +" consists of:");
        System.out.println(numberofonedollars+" dollars");
        System.out.println(numberofquaters+" quarters");
        System.out.println(numberofdimes + " dimes");
        System.out.println(numberofnickels +" nickels" );
        System.out.println(numberofpennies +" pennies");

    }

}
