package assignment5;
//import java.lang.*;
public class Assignment5_Qn15_pattern {
    public static <string> void main(String[] args) {
        //pattern A
        System.out.println("Pattern A");
        for (int i = 1; i < 7; i++) {
            int j = 1;
            while (j < i) {
                System.out.print("*" + " ");
                j++;
            }
            System.out.println();
        }

        //pattern B
        System.out.println("\nPattern B");
        for (int i = 1; i < 7; i++) {
            int j = 7;
            while (j > i) {
                System.out.print("*" + " ");
                j--;
            }
            System.out.println();
        }
        //pattern C
        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //pattern D
        System.out.println("Pattern D");
        for (int i = 1; i <= 6; i++) {
            for (int k = i; k > 1; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
