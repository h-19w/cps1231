package assignment2;
import java.util.Scanner;

public class Assignment2_Qn13_6month_bankaccountvalue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        double money_amount = input.nextDouble();
        double first_month_money, second_month_money,
                third_month_money, fourth_month_money, fifth_month_money, sixth_month_money;
        double the_monthly_interest_rate = 0.003125;

        first_month_money = money_amount * (1 + the_monthly_interest_rate);
        second_month_money = (first_month_money + 100) * (1 + the_monthly_interest_rate);
        third_month_money = (second_month_money + 100) * (1 + the_monthly_interest_rate);
        fourth_month_money = (third_month_money + 100) * (1 + the_monthly_interest_rate);
        fifth_month_money = (fourth_month_money + 100) * (1 + the_monthly_interest_rate);
        sixth_month_money = (fifth_month_money + 100) * (1 + the_monthly_interest_rate);

        System.out.println("After the sixth month, the account value is " + sixth_month_money);

    }
}