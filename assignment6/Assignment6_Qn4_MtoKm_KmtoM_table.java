package assignment6;
public class Assignment6_Qn4_MtoKm_KmtoM_table {
    public static void main(String[] args) {
        System.out.println("miles kilometers|\tkilometers miles\t");
        for(double m = 1, k = 20; m <= 10; m++, k+=5)
            System.out.printf("%1.0f\t%8.3f\t|%5.0f\t%13.3f\t\n" ,m,mileToKm(m),k,kmToMile(k));

    }
    public static double mileToKm(double mile) {
        double mtkm = 0;
        mtkm = (mile * 1.609);
        return mtkm;
    }
    public static double kmToMile(double km) {
        double kmtm = 0;
        kmtm = (km * 0.6215);
        return kmtm;
    }
}
