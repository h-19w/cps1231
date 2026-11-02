import java.util.Scanner;

public class TRY {
    public static void PrintCalendar() {
        System.out.println("Welcome to Calendar");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        System.out.println("Enter the month in numbers between 1 and 12\n -OR- \nEnter 0 to print all the months: ");
        int month = input.nextInt();
        if (month < 0 || month > 12) {
            System.out.println("Invalid option");
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
                System.out.println();
            }
        }
        if (month > 0 && month < 13) {
            System.out.println(" " + monthname + " " + year);
            System.out.println("----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
            printMonthBody(year, month);
            System.out.println();
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



