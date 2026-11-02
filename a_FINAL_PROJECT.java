import java.util.Scanner;

public class a_FINAL_PROJECT {
    public static void main(String[]args){
        Scanner input = new Scanner((System.in));
        int res;
        menu();
        do {
            res = input.nextInt();
            switch (res){
                case 0:System.out.println("Invalid option");
                    menu();
                    break;
                case 1: AdditionQuiz();
                    menu(); break;
                case 2: GuessCard();
                    menu(); break;
                case 3: BMI();
                    menu(); break;
                case 4:Investment();
                    menu(); break;
                case 5: PrintCalendar();
                    menu(); break;
                case 6: break;
                default: System.out.println("invalid option\nChoose again: "); res = 7; break;
            }
        } while (res != 6);
        input.close();
        System.out.println("Terminating...");

    }
    public static void menu(){
        System.out.println("Main Menu: \n" +
                "1. Addition Quiz \n" +
                "2. Guess the first card \n" +
                "3. Calculate BMI \n" +
                "4. Investment calculator \n" +
                "5. Print Calendar \n" +
                "6. Exit \n" +
                "Enter your option:");
    }
    public static void AdditionQuiz(){
        Scanner input = new Scanner(System.in);
        System.out.println("The following test has 5 addition questions, the time used to take the test is recorded."
                +"the test starts now! ");
        final int NUMBER_OF_QUESTIONS = 5; // Number of questions
        int correctCount = 0; // Count the number of correct answers 7 int count = 0; // Count the number of questions
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " "; // output string is initially empty

        while (count < NUMBER_OF_QUESTIONS) {
            int num1 = (int) (Math.random() * 13);
            int num2 = (int) (Math.random() * 13);


            if (num1 < num2) {
                int num = num1;
                num1 = num2;
                num2 = num;
            }
            System.out.println("What is " + num1 + " + " + num2 + "? ");
            int answer = input.nextInt();

            if (num1 + num2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else
                System.out.println("Your answer is wrong.\n" + num1
                        + " + " + num2 + " should be " + (num1 + num2));

            count++;

            output += "\n" + num1 + "+" + num2 + "=" + answer + ((num1 + num2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is\n " + correctCount +"/10"+
                "\nTest time is " + testTime / 1000 + " seconds");
        double percentage = (correctCount * 10);
        System.out.println("final score is: " + (percentage) +"% !!!");
        System.out.println();
    }
    public static void GuessCard(){
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        // the first card
        String Card = "";
        String rank = "";
        String suit = "";
        for (int i = 0; i < 4; i++) {
            suit = suits[deck[i] / 13];
            rank = ranks[deck[i] % 13];
            Card = rank + " of " + suit;
        }
        System.out.println("Guess what is the first card ? (etc. 2 of Clubs)");
        for (int i = 5; i != 0; i--) {
            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();
            if (i==4){
                System.out.println("hint: the number is–"+rank);
            }
            if (i==2 && answer!=Card)
                System.out.println("hint: the suit is–" + suit);
            if (answer.equalsIgnoreCase(Card)) {
                System.out.println("You are CORRECT!!!!\n ––GAME OVER––");break;
            } else {
                System.out.println("Your answer is wrong. try again !! ");
                System.out.println("You have " + (i-1) + " tries left");
            }
        }
        System.out.println();
    }
    public static void BMI(){
        Scanner input = new Scanner(System.in);
        double BMI,pound,inches, kg, meters;

        System.out.print("Enter weight in pounds: ");
        pound = input.nextDouble();

        System.out.print("Enter height in inches: ");
        inches = input.nextDouble();

        kg = pound *  0.45359237;
        meters = inches * 0.0254;
        BMI = kg / Math.pow(meters, 2);
        System.out.println("BMI is" + BMI);

        if (BMI < 18.5)
            System.out.println("Underweight"); else if (BMI < 25)
            System.out.println("Normal"); else if (BMI < 30)
            System.out.println("Overweight"); else
            System.out.println("Obese");

        System.out.println();
    }
    public static void Investment(){
        Scanner input = new Scanner(System.in);
        double futureInvestmentValue, investmentAmount, numberofyears, annualinterestrate;
        System.out.print("Enter investment amount: ");
        investmentAmount =input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        annualinterestrate =input.nextDouble();
        System.out.print("Enter number of years: ");
        numberofyears =input.nextDouble();

        futureInvestmentValue =investmentAmount *Math.pow((1+annualinterestrate /1200),(numberofyears *12));
        System.out.println("Future value is $"+futureInvestmentValue);

        System.out.println();
    }
    public static void PrintCalendar() {
        System.out.println("Welcome to Calendar");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        System.out.println("Enter the month in numbers between 1 and 12\n -OR- \nEnter 0 to print all the months: ");
        int month = input.nextInt();
        while (month < 0 || month > 12) {
            System.out.println("Invalid option\n");
            System.out.println("Enter the month in numbers between 1 and 12\n -OR- \nEnter 0 to print all the months: ");
            month = input.nextInt();
        }
//      month
        String monthname = "";
        switch (month) {
            case 1:
                monthname = "January";
                break;
            case 2:
                monthname = "Feburary";
                break;
            case 3:
                monthname = "March";
                break;
            case 4:
                monthname = "April";
                break;
            case 5:
                monthname = "May";
                break;
            case 6:
                monthname = "June";
                break;
            case 7:
                monthname = "July";
                break;
            case 8:
                monthname = "August";
                break;
            case 9:
                monthname = "September";
                break;
            case 10:
                monthname = "October";
                break;
            case 11:
                monthname = "November";
                break;
            case 12:
                monthname = "December";
            default:
                break;
        }
        if (month == 0) {
            for (month = 1; month < 13; month++) {
                switch (month) {
                    case 1:
                        monthname = "January";
                        break;
                    case 2:
                        monthname = "Feburary";
                        break;
                    case 3:
                        monthname = "March";
                        break;
                    case 4:
                        monthname = "April";
                        break;
                    case 5:
                        monthname = "May";
                        break;
                    case 6:
                        monthname = "June";
                        break;
                    case 7:
                        monthname = "July";
                        break;
                    case 8:
                        monthname = "August";
                        break;
                    case 9:
                        monthname = "September";
                        break;
                    case 10:
                        monthname = "October";
                        break;
                    case 11:
                        monthname = "November";
                        break;
                    case 12:
                        monthname = "December";
                }
                System.out.println(" " + monthname + " " + year);
                System.out.println("----------------------------");
                System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
                printMonthBody(year, month);
                System.out.println("\n");
            }
        }
        if (month > 0 && month < 13) {
            System.out.println(" " + monthname + " " + year);
            System.out.println("----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
            printMonthBody(year, month);
            System.out.println("\n");
        }
    }
    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numberDayInMonth = getNumberofDaysInMonth(year, month);
        int i;
        for (i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (i = 1; i <= numberDayInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }
    public static int getStartDay(int year, int month) {
        int h, q, m, j, k, statement;
        int day = 1;
        q = day;
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }
        m = month;
        j = year / 100;
        k = year % 100;
        h = (q + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
        switch (h) {
            case 0:
                statement = 6;
                break;
            case 1:
                statement = 0;
                break;
            case 2:
                statement = 1;
                break;
            case 3:
                statement = 2;
                break;
            case 4:
                statement = 3;
                break;
            case 5:
                statement = 4;
                break;
            case 6:
                statement = 5;
                break;
            default:
                statement = -1;

        }
        return statement;
    }
    public static int getNumberofDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if (month == 2)
            return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
        return 0;
    }
}






