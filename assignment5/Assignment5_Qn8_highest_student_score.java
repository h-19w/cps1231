package assignment5;
import java.util.Scanner;
public class Assignment5_Qn8_highest_student_score {
    public static void main(String[]args){
        int numofs;
        double highestScore = 0,fakeScore;
        String sName = "", fakeName;
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the number of the students:");
        numofs = inputScanner.nextInt();


        if(numofs > 0) {
            for(int i = 1 ; i <= numofs ; i++) {
                System.out.print("Enter the student's name: ");
                fakeName = inputScanner.next();

                System.out.print("Enter the student's score: ");
                fakeScore = inputScanner.nextDouble();

                if(fakeScore > highestScore) {
                    sName = fakeName;
                    highestScore = fakeScore;
                }
            }
            System.out.println("The name of the student with the highest score is " + sName);
        }
        else
            System.out.println("The number of the students is less than or equals to 0\n"
                    + "Invalid input");
    }
}
