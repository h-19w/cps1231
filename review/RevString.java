package review;
import java.util.Scanner;
public class RevString {
    public static void main(String[]args){
        System.out.println("please enter a phrase: ");
        Scanner input = new Scanner(System.in);
        String hi = input.nextLine();
        String result = reverseS(hi);
        System.out.print("the reversed input is: "+result);

    }
    public static String reverseS(String s) {
        if (s == null) {
            return null;
        }
        String finalstring = "";
        for (int strIndex = s.length()-1; strIndex >= 0;strIndex--) {
            finalstring += (s.charAt(strIndex));
        }
        return finalstring;
    }
}
