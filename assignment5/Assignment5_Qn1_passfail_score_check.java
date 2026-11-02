package assignment5;
import java.util.Scanner;

public class Assignment5_Qn1_passfail_score_check {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score, press '-1' to exit: ");
        double score_input = input.nextDouble() ;
        if  (score_input != -1)
            if (score_input == 60 || score_input > 60)
                System.out.println("you pass the exam");
            else
                System.out.println("you don't pass the exam");

        else
            System.out.println("exiting the program");
            System.exit(-1);

    }
}
//Pass or fail) Write a program that prompts a student to enter a Java score.
// If the score is greater or equal to 60, display “you pass the exam”;
// otherwise, display “you don’t pass the exam”.
// Your program ends with input -1. Here is a sample run:
//Enter your score: 80
//You pass the exam.
//Enter your score: 59
//You don't pass the exam.
//Enter your score: −1
//No numbers are entered except 0