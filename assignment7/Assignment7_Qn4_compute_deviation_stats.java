package assignment7;
import java.util.Scanner;
public class Assignment7_Qn4_compute_deviation_stats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] doubleArray = new double[10];
        System.out.println("Enter 10 double values ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number #" + (i + 1) + ": ");
            doubleArray[i] = input.nextDouble();
        }
        double meanValue = mean(doubleArray);
        double deviationValue = deviation(doubleArray);

        System.out.println("The mean is " + meanValue);
        System.out.println("The standard deviation is " + deviationValue);
    }
    public static double mean(double[]x) {
        double sum = 0;
        for (double num : x) {
            sum += num;
        }
        return sum / x.length;
    }
    public static double deviation(double[]x) {
        double meanValue = mean(x);
        double sumSquaredDeviations = 0;
        for (double num : x) {
            sumSquaredDeviations += Math.pow(num - meanValue, 2);
        }
        return Math.sqrt(sumSquaredDeviations / (x.length - 1));
    }
}
