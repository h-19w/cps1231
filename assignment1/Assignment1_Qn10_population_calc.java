public class Assignment1_Qn10_population_calc {
    public static void main(String[] args) {
        double birth = 7/60;
        double death = 13/60;
        double immigrant = 45/60;
        double current_popu = 312032486;
        double year = 365;
        double increase_immi = 31536000/45;//per year increase
        double increase_birth = 31536000/7;
        double decrease = 31536000/13;
        double tot_increase = increase_birth+increase_immi;
        double census = tot_increase-decrease;
        double firstyr = current_popu + census;
        double secyr = firstyr + census;
        double thirdyr = secyr + census;
        double fourthyr = thirdyr + census;
        double fifthyr = fourthyr + census;

        System.out.println("the population for the first year of census is " + firstyr);
        System.out.println("the population for the second year of census is " + secyr);
        System.out.println("the population for the third year of census is " + thirdyr);
        System.out.println("the population for the fourth year of census is " + fourthyr);
        System.out.println("the population for the fifth year of census is " + fifthyr);
    }
}
