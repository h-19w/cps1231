package assignment4;
import java.util.Scanner;
public class Assignment4_Qn9_substring_check {
    public static void main(String[]args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        String s1 = input.next();
        System.out.println("Enter sub string s2: ");
        String s2 = input.next();

        boolean s3 = s1.contains(s2);
        System.out.println(s3);
        if ( s3 == true)
            System.out.println(s2 + " is a substring of " + s1);
        else if (s3 == false)
            System.out.println(s2 + " is not a substring of " + s1);
    }
}
