package assignment5;

import java.util.Scanner;
public class Assignment5_Qn17_loan_InterestPrincipalBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter loan amount: ");
        double amount = input.nextDouble();

        System.out.println("Enter number of years: ");
        double years = input.nextDouble();

        System.out.println("Enter annual interest rate: ");
        double rate = input.nextDouble();

        double monthlypayment = amount * (rate / 1200)
                / (1 - 1 / Math.pow(1 + (rate / 1200), years * 12));
        double totalpayment = monthlypayment * years * 12;
        double balance = amount;
        double monthlytate = rate / 1200;

        System.out.printf("Monthly payment: %.2f\n", monthlypayment);
        System.out.printf("Total payment: %.2f\n\n", totalpayment);

        System.out.printf("Payment#\tInterest\tPrincipal\tBalance\n");

        for (int i = 1; i <= years * 12; i++) {
            double interest = monthlytate * balance;
            double principal = monthlypayment - interest;
            balance = balance - principal;
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i, interest, principal, balance);
        }
    }
}