package assignment5;
public class Assignment5_Qn6_pingTOsqm_N_sqmTOping_table {
    public static void main(String[]args) {
//        (note that 1 ping = 3.305 square meters):
        float ping = 10;
        float sqm = 30;
        while (ping <= 80) {
            System.out.printf("%-8.0f%8.3f", ping, (ping * 3.305));
            System.out.print("   |   ");
            System.out.printf("%-8.0f%8.3f\n", sqm, (sqm / 3.305));
            sqm = (sqm + 5);
            ping = (ping + 5);
        }
    }
}
