package assignment5;
import java.util.Scanner;
public class Assignment5_Qn23 {
    public static void main(String[] args) {
        byte bytenumber;
        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        bytenumber = input.nextByte();

        System.out.println("The bits are: ");
        for(int i = 7;i>=0;i--) {
            int temp = bytenumber >> i;
            int bit = temp & 1;
            System.out.print(bit);
        }
    }
}
