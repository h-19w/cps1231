package assignment6;
import java.util.Scanner;

public class Assignment6_Qn9_count_string_characters {
    public static void main(String[]args){
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println("The number of letters in the string is: "+ countLetters(s));
    }
    public static int countLetters(String s){
       return s.length();
    }
}
