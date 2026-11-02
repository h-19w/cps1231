package assignment7;
import java.util.Scanner;

public class Assignment7_Qn10_vowel_count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = input.nextLine();
        System.out.println("The number of lowercase vowelscount is " + Test2(s));
        System.out.println("The number of uppercase vowelscount is " + Test1(s));

    }
    public static int Test1(String s1) {
        if (s1 == null || s1.isEmpty()) {
            return 0;
        }
        int vowelsCountCap = 0;
        for (int i = 0; i < s1.length(); i++) {
            char currentChar = s1.charAt(i);

            if (currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
                vowelsCountCap++;
            }
        }
        return vowelsCountCap;
    }
    public static int Test2(String s2) {
        if (s2 == null || s2.isEmpty()) {
            return 0;
        }
        int vowelsCount = 0;
        for (int i = 0; i < s2.length(); i++) {
            char currentChar = s2.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
