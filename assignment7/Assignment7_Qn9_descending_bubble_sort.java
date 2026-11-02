package assignment7;
import java.util.Arrays;

public class Assignment7_Qn9_descending_bubble_sort {
    public static void main(String[] args) {
        double[]numbers = {1.0,2.0,5.0,2.3,4.0,9.5,0.1,5.4,6.1,2.9};
        System.out.println("The original list: " + Arrays.toString(numbers));
        DesbubbleSort(numbers);
        System.out.println("The bubble sort list: " + Arrays.toString(numbers));
        numbers = reverse(numbers);
        System.out.println("The reverse: "+ Arrays.toString(numbers));
    }
    public static void DesbubbleSort(double [] list) {
        for(int i = 0; i< list.length - 1;i++) {
            double currentmin = list[i];
            int currentminindex = i;
            for(int j = i+ 1;j < list.length;j++) {
                if(currentmin > list[j]) {
                    currentmin = list[j];
                    currentminindex = j;
                }
            }
            if(currentminindex != i) {
                list[currentminindex] = list[i];
                list[i] = currentmin;
            }
        }
    }
    public static double[] reverse(double[] list) {
        double[]result = new double[list.length];
        for(int n = 0, m = result.length - 1;n < list.length;n++,m--) {
            result[m] = list[n];
        }
        return result;
    }
}
