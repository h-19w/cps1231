package assignment3;
import java.util.Scanner;

public class Assignment3_Qn7_flip_the_coin {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Heads or Tails ? for Heads type 0, for Tails type 1 : ");
        int answer = input.nextInt();
        int coin = (int)(Math.random());
        if (answer == coin)
            System.out.print("congratulations you guessed correctly !! the answer is ");
        else
            System.out.print("Awwww too bad thats the wrong answer :(  the correct answer is ");

        if (coin == 0 || coin == 1)
            switch (coin) {
                case 0:
                    System.out.print("Heads");
                    break;
                case 1:
                    System.out.print("Tails");
            }
    }
}

