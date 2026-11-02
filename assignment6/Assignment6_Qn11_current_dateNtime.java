package assignment6;
import java.text.DecimalFormat;
public class Assignment6_Qn11_current_dateNtime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        int totalDays = (int) (totalMilliseconds / 1000 / 60 / 60 / 24);

        int currentYear = 1970;
        while (totalDays >= (isLeapYear(currentYear) ? 366 : 365)) {
            totalDays -= isLeapYear(currentYear) ? 366 : 365;
            currentYear++;
        }

        int currentMonth = 1;
        while (totalDays >= getDaysInMonth(currentYear, currentMonth)) {
            totalDays -= getDaysInMonth(currentYear, currentMonth);
            currentMonth++;
        }

        int currentDay = totalDays + 1;

        System.out.printf("Current date is %d-%d-%d\n", currentYear, currentMonth, currentDay);
        System.out.println("Current time is: " + CurrentTime(0));
    }
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
    private static int getDaysInMonth(int year, int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }
    public static String CurrentTime(long GMT) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long currentHr;
        if (GMT < 0) { //minus like -8GMT
            currentHr = Math.abs((12 + (GMT - currentHour)) + 12); //AM
        } else {
            currentHr = currentHour + GMT;  //PM
        }

        DecimalFormat format = new DecimalFormat("0.#");
        String curTime;
        if (currentHr > 13) {
            curTime = ("Current time is " + format.format((currentHr - 12)) + ":" + format.format(currentMinute) + ":" + format.format(currentSecond) + "PM," + GMT + " GMT");
        } else {
            curTime = ("Current time is " + format.format(currentHr) + ":" + format.format(currentMinute) + ":" + format.format(currentSecond) + "AM," + GMT + " GMT");
        }
        return curTime;
    }
}
