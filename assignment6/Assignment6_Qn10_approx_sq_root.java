package assignment6;
import java.util.Scanner;
public class Assignment6_Qn10_approx_sq_root {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("guess the square root ");
        double guess = in.nextDouble();
        double result = sqrt(guess);
        System.out.println("Square root of " + guess + " is approximately " + result);
    }

    public static double sqrt(double n) {
        if (n < 0) {
            System.exit(0);
        }
        double lastGuess = 1.0;
        double dif = 0.00001;

        while (Math.abs(lastGuess * lastGuess - n) > dif) {
            double nextGuess = (lastGuess + n / lastGuess) / 2;
            lastGuess = nextGuess;
        }
        return lastGuess;
    }
}
