package assignment6;
public class Assignment6_Qn8_days_in_yearInterval {
    public static void main(String[]args){
        for(int i = 2014; i <= 2034; i++) {
            System.out.println("Year " + i + ": " + numberOfDaysInAYear(i) + " days.");
        }
    }
    public static int numberOfDaysInAYear(int year) {
        if (year % 400 == 0||(year % 4 == 0 && year % 100 != 0))
            return 366;
        return 365;
    }
}
