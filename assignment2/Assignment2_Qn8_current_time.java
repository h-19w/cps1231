package assignment2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Assignment2_Qn8_current_time {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the timezone :");
        long GMT = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long currentHr = currentHour + GMT;
        DecimalFormat format = new DecimalFormat("0.#");
        if (currentHr < 0) {
            currentHr = currentHr + 12;
            System.out.println("Current time is " + currentHr + ":" + currentMinute + ":" + currentSecond + "PM," + GMT + " GMT");
        }
        else {
            System.out.println("Current time is " + currentHr + ":" + currentMinute + ":" + currentSecond + "AM," + GMT + " GMT");
        }
    }
}
