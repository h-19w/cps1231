package assignment6;
public class Assignment6_Qn12_palindromic_prime {
    public static void main(String[] args) {
        int palindprimecount = 0;
        for (int i = 2; palindprimecount != 100; i++) {
            if (isPalindrome(i) && isPrime(i)) {
                System.out.print(i + " ");
                palindprimecount++;
                if (palindprimecount % 10 == 0)
                    System.out.print("\n");
            }
        }
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++)
            if (number % i == 0) {
                return false;
            }
        return true;
    }
    public static int reverse(int number) {
        int reversenumber = 0;
        while (number > 0) {
            reversenumber = reversenumber * 10 + number % 10;
            number /= 10;
        }
        return number;
    }
    public static boolean isPalindrome(int num) {
        boolean var = true;
        String s = String.valueOf(num);
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                var = false;
                break;
            } else {
                low++;
                high--;
            }

        }return var;
    }
}


