package assignment5;
public class Assignment5_Qn13 {
    public static void main (String[]args){

        int n = 1;
        while (Math.pow(n,2) < 12000) {
            n++;
            System.out.println("The largest is"+ --n);
        }
    }
}
