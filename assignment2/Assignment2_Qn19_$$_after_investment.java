package assignment2;
import java.util.Scanner;
public class Assignment2_Qn19_$$_after_investment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    double futureInvestmentValue, investmentAmount, numberofyears, annualinterestrate;
    System.out.print("Enter investment amount");

    investmentAmount =input.nextDouble();
    System.out.print("Enter annual interest rate in percentage:");
    annualinterestrate =input.nextDouble();
    System.out.print("Enter number of years: ");
    numberofyears =input.nextDouble();

    futureInvestmentValue =investmentAmount *Math.pow((1+annualinterestrate /1200),(numberofyears *12));
    System.out.println("Future value is $"+futureInvestmentValue);

    }
}
