package assignment6;

public class Assignment6_Qn5_numberof_primeNumbers_in_interval {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 2; i <= 10000; i++) {
            if (isPrime(i)) {
                number++;
            }
        }
        System.out.println("There are " + number + " prime numbers from 1 to 10000." );
    }
    public static boolean isPrime(int inputN) {
        for (int i = 2; i <= Math.sqrt(inputN); i++) {
            if (inputN % i == 0) { // divisible by i = not prime number
                return false;
            }
        }
        return true;
    }
}

