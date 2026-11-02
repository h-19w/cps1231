package assignment4;
import java.util.Scanner;
public class Assignment4_Qn10_country_descending_order {
    public static void main(String[]args ){
        Scanner input = new Scanner(System.in);
        String c1,c2,c3;
        System.out.println("Enter the first country: ");
        c1 = input.next();
        System.out.println("Enter the second country: ");
        c2 = input.next();
        System.out.println("Enter the third country: ");
        c3 = input.next();

        String first;
        if ((c2.compareTo(c1) > 0) && (c2.compareTo(c3) > 0)) {
            first = c1;
            c1 = c2;
            c2 = first;
        }
        else if ((c3.compareTo(c1) > 0) && (c3.compareTo(c2) > 0)) {
            first = c1;
            c1 = c3;
            c3 = c2;
            c2 = first;
        }
        if (c3.compareTo(c2) > 0)
        {
            first = c2;
            c2 = c3;
            c3 = first;
        }

        System.out.println("The three countries in descending order are " +
                c1 + " " + c2 + " " + c3);
    }
}
