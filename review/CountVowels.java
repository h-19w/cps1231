package review;

import java.util.Scanner;
public class CountVowels{
    public static int numberOfVowels(String s){
        if (s==null || s.isEmpty()){
            return 0;
        }
        int vowelcount = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            char letter =s.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                vowelcount++;
            }
        }
        return vowelcount;
    }
    public static void main(String[]args){
        System.out.println("please enter a word or a sentence: ");
        Scanner input = new Scanner(System.in);
        String h = input.nextLine();
        int result = numberOfVowels(h);
        System.out.println("the number of vowels are: " + result);
    }

}
