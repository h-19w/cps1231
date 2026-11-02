package assignment5;
import java.util.*;
public class Assignment5_Qn21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal: ");
        String decimal = input.nextLine();
        System.out.println(Integer.parseInt(decimal,12));
    }
}
