package assignment7;
import java.util.Arrays;
public class Assignment7_Qn8_bubble_sort_algorithm {
    public static void main(String[] args) {
        double[]numbers = {1.0,2.0,5.0,2.3,4.0,9.5,0.1,5.4,6.1,2.9};
        System.out.println("The original list: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("The bubble sort list: " + Arrays.toString(numbers));
    }
    public static void bubbleSort(double []list) {
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
}
