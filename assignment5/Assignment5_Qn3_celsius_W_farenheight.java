package assignment5;
public class Assignment5_Qn3_celsius_W_farenheight {
    public static void main(String[]args ){
//        farenheit = celsius * 9/5 + 32
        float celsius = 0;
        while (celsius <= 100) {
            System.out.printf("%-5.0f%5.1f\n", celsius, (celsius * 9/5 + 32));
            celsius++;
        }
    }
}
