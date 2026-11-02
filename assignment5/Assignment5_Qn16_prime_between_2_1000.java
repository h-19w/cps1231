package assignment5;
public class Assignment5_Qn16_prime_between_2_1000 {
    public static void main(String[] args) {
        final int numofpperln = 8;
        int count = 0;
        int number = 2;
        System.out.print("The prime between 2 and 1000 are: \n");
        for(;number <=1000; number++) {
            boolean isPrime = true;
            for(int divisor = 2;divisor <= number / 2;divisor++) {
                if(number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
                if(count % numofpperln == 0) {
                    System.out.println(number);
                }
                else
                    System.out.print(number + " ");
            }
        }
    }
}
