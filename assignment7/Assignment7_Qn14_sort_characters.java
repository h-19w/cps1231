package assignment7;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment7_Qn14_sort_characters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.println("The new string: "+ sort(s));
    }
    public static String sort(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
