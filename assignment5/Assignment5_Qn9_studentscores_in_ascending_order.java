package assignment5;
import java.util.Scanner;
public class Assignment5_Qn9_studentscores_in_ascending_order {
    public static void main(String[]args) {
        int numberOfs;
        double lowestscore = 0, secondlowest = 0, tempscore;
        String firstname = "", secondname = "", tempname;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        numberOfs = input.nextInt();

        if(numberOfs > 0) {
            for (int i =1; i <= numberOfs;i++) {
                System.out.print("Enter student's name: ");
                tempname = input.next();
                System.out.print("Enter student's score: ");
                tempscore = input.nextDouble();

                if(tempscore >secondlowest ){
                    secondname = firstname;
                    secondlowest = lowestscore;
                    firstname = tempname;
                    lowestscore = tempscore;
                    continue;
                }
                if(tempscore > lowestscore) {
                    secondname = tempname;
                    secondlowest = tempscore;
                }
            }
            System.out.println("The name of the student with the lowest score is " + firstname);
            System.out.println("The name of the student with the second-lowest score is " + secondname );
        }
        else
            System.out.println("The number of the students is less than or equals to 0\n"
                    + "Invalid input");
    }
}
