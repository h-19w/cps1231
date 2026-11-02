package assignment7;
//(The number of even numbers and odd numbers) Write a program that generates 10 2-digit
//Integers randomly using Math.random(), and then display 10 randomly generated integers
// and the number of even numbers and odd numbers.
// Here is the sample run:
//10 randomly generated 2-digit integers :
//38 29 21 49 75 3 48 86 33 59
//The number of odd numbers  : 3
//The number of even numbers : 7
import java.util.Arrays;
public class Assignment7_Qn1_10_random_evenNodd {
    public static void main(String[]args){
        System.out.print("10 randomly generated 2-digit integers: ");
        int[] randomNumbers = generateRandomIntegers(10, 10, 99);
        System.out.println(Arrays.toString(randomNumbers));
        int evenCount = countEvenNumbers(randomNumbers);
        int oddCount = 10 - evenCount;

        System.out.println("\nThe number of odd numbers: " + oddCount);
        System.out.println("The number of even numbers: " + evenCount);
    }
    public static int[] generateRandomIntegers(int count, int min, int max) {
        int[] randomNumbers = new int[count];
        for (int i = 0; i < count; i++) {
            randomNumbers[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return randomNumbers;
    }
    public static int countEvenNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
