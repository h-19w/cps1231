public class Assignment1_Qn12 {
    public static void main(String[] args) {
//        ax + by = e
//        cx + dy = f
//        x = (ed-bf) / (ad-bc)
//        y = (af-ec) / (ad-bc)
        double a = 3.6;
        double b = 50.2;
        double e = 44.5;
        double c = 2.8;
        double d = 0.55;
        double f = 5.9;
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c );
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
