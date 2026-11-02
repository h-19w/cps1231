package assignment7;
import java.util.Scanner;

public class Assignment7_Qn12_permutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter four numbers: ");
        int[] list = new int[4];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.println("PERMUTATIONS");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                for (int m = 0; m < list.length; m++) {
                    for (int n = 0; n < list.length; n++) {
                        if (i != j && i != m && i != n && j != m && n != j && m != n) {
                            System.out.println(list[i] + " " + list[j] + " " + list[m] + " " + list[n]);
                        }
                    }
                }
            }
        }
    }
}
