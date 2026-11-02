package assignment7;
//7 (Execution time) Write a program that creates an array of numbers from 1 to
//100,000,000 in ascending order.
// Display the execution time of invoking the
// linearSearch method and the binarySearch method in Listings 7.6 and 7.7 respectively.
// Display the execution time of invoking both searches
// for the following numbers: 1; 25,000,000; 50,000,000; 75,000,000; 100,000,000.
// You can use the following code template to obtain the execution time:
import java.util.Arrays;
public class Assignment7_Qn7_execution_time {
    public static void main(String[] args) {
        int []numbers = new int[100_000_000];
        for(int i =0; i < numbers.length;i++) {
            numbers[i] = i +1;
        }
        int []searchnumbers = {1, 25_000_000, 50_000_000, 75_000_000, 100_000_000};
        for (int num: searchnumbers) {
            long linearsearchtime = linearsearch(numbers,num);
            long binarysearchtime = BinarySearch(numbers,num);
            System.out.println("linearsearchtime" + " "+  num + " is " + linearsearchtime);
            System.out.println("binarysearchtime" + " "+ num +" is " + binarysearchtime);
        }
    }

    public static long linearsearch(int[] list, int searchnumbers) {
        long startTime = System.nanoTime();
        for (int i = 0; i < list.length; i++) {
            if (searchnumbers == list[i])
                break;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public static long BinarySearch(int[] array, int searchnumbers) {
        long startTime = System.nanoTime();
        Arrays.binarySearch(array, searchnumbers);

        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}