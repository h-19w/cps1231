package assignment5;
public class Assignment5_Qn12 {
    public static void main(String[] args) {
        int n = 1;
        while(Math.pow(n, 3) < 12000)
            n++;
        System.out.println("The smallest is"+ --n);

    }
}
