package assignment2;
import java.util.Scanner;

public class Assignment2_Qn18_interest_rate {
    public static void main(String[] args) {
        double interest,balance,annualinterestrate;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter balance and interest rate(e.g., 3 for 3%): ");
        balance = input.nextDouble();
        annualinterestrate = input.nextDouble();

        interest = balance * (annualinterestrate / 1200);
        System.out.println("The interest is" + interest);

    }
}
