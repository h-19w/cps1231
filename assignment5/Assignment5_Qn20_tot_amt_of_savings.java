package assignment5;
import java.util.Scanner;
public class Assignment5_Qn20_tot_amt_of_savings {
    public static void main(String[] args) {
        System.out.println("Enter an amount: ");
        Scanner input = new Scanner (System.in);
        double amount = input.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        double rate = input.nextDouble() / 100.0;

        System.out.println("Enter the number of months: ");
        double month = input.nextDouble();
        double account = 0;

        double monthlyrate = rate / 12;
        for (int i = 1;i <=month;i++)
            account = (account + amount) * (1 + monthlyrate);
        System.out.println("The total amount of savings is " + account);
    }
}

