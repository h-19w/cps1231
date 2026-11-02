package assignment5;
import java.util.Scanner;
public class Assignment5_Qn24_reversed_string {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        System.out.println("The reversed string is: ");
        for (int strIndex = string.length()-1; strIndex >= 0;strIndex--)
            System.out.printf("%c",string.charAt(strIndex));
    }
}
