package assignment5;
public class Assignment5_Qn4_inch_W_cm {
    public static void main(String[] args) {
    //     (note that 1 inch is 2.54 centimeters):
    float inch = 1;
    while(inch <=10 ){
        System.out.printf("%-5.0f%5.2f\n", inch, (inch * 2.54));
        inch++;

        }
    }
}
