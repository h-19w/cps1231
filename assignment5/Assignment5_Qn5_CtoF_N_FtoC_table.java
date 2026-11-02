package assignment5;
public class Assignment5_Qn5_CtoF_N_FtoC_table {
    public static void main(String[]args){
        float celsius = 0;
        float farenheit = 20;
        while (celsius <= 100) {
            System.out.printf("%-8.0f%8.3f", celsius, (celsius * 9/5 + 32));
            System.out.print("   |   ");
            System.out.printf("%-8.0f%8.3f\n", farenheit, (farenheit - 32) * 5/9 ) ;
            celsius = (celsius + 2);
            farenheit = (farenheit + 5);
        }
    }
}
