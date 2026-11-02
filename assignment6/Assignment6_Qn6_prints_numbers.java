package assignment6;
public class Assignment6_Qn6_prints_numbers {
    public static void main(String[] args) {
        printCharacters(1,100,10);
    }
    public static void printCharacters(int num1,int num2,int numberPerLine){
        int number = 0;
        for (int i = num1; i <= num2; i++) { //
            System.out.print(i + " ");
            number++;
            if (number % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}