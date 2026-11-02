package assignment4;
import java.util.Scanner;
public class Assignment4_Qn8_uni_majorNyear {
    public static void main(String[]args ){
        System.out.println("please enter the first letter(in caps) of your major and year: ");
        Scanner input = new Scanner(System.in);
        String status = input.next();
        char Mj = status.charAt(0);
        char Yr = status.charAt(1);

        if(status.length() != 2) {
            System.out.println("invalid input ");
            System.exit(1);
        }
        if ('I' == Mj) {
            if ('1' == Yr)
                System.out.println("Information Management Freshmen");
            else if ('2' == Yr) {
                System.out.println("Information Management Sophomore");
                }
            else if ('3' == Yr) {
                System.out.println("Information Management Junior");
                }
            else if ('4' == Yr) {
                    System.out.println("Information Management Senior");
                }
            else {
                    System.out.println("Invalid input");
                }
            }
        else if ('C' == Mj) {
            if ('1' == Yr)
                System.out.println("Computer Science freshmen");
            else if ('2' == Yr) {
                System.out.println("Computer Science sophomore");
            }
            else if ('3' == Yr) {
                System.out.println("Computer Science junior");
            }
            else if ('4' == Yr) {
                System.out.println("Computer Science senior");
            } else {
                System.out.println("Invalid input");
            }
        }
        else if ('A' == Mj) {
            if ('1' == Yr)
                System.out.println("Accounting freshmen");
            else if ('2' == Yr) {
                System.out.println("Accounting sophomore");
            }
            else if ('3' == Yr) {
                System.out.println("Accounting junior");
            }
            else if ('4' == Yr) {
                System.out.println("Accounting  senior");
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
}

