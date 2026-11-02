package assignment5;
import java.util.Scanner;
public class Assignment5_Qn2_multiplication_test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The following test has 10 multiplication questions, the time used to take the test is recorded."
        +"the test starts now! ");
        final int NUMBER_OF_QUESTIONS = 10; // Number of questions
        int correctCount = 0; // Count the number of correct answers 7 int count = 0; // Count the number of questions
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " "; // output string is initially empty

        while (count < NUMBER_OF_QUESTIONS) {
            int num1 = (int) (Math.random() * 13);
            int num2 = (int) (Math.random() * 13);

            if (num1 < num2) {
                int num = num1;
                num1 = num2;
                num2 = num;
            }
            System.out.println("What is " + num1 + " * " + num2 + "? ");
            int answer = input.nextInt();

            if (num1 * num2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else
                System.out.println("Your answer is wrong.\n" + num1
                        + " * " + num2 + " should be " + (num1 * num2));

            count++;

            output += "\n" + num1 + "*" + num2 + "=" + answer + ((num1 * num2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is\n " + correctCount +"/10"+
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);

        double percentage = (correctCount * 10);
        System.out.println("\nfinal score is: " + (percentage) +"% !!!");
    }
}
