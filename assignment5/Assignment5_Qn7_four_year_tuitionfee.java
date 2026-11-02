package assignment5;
public class Assignment5_Qn7_four_year_tuitionfee {
    public static void main(String[]args){
//        Suppose that the tuition for a university is $10,000 this year and i
//        ncreases 6% every year.
//        In one year, the tuition will be $10,600.
//Write a program that computes the tuition in ten years
// and the total cost of four years’ worth of tuition after the tenth year.
        double tuition = 10000;
        double rate = 6.0 / 100.0;
        double fyrstottuit =0;

        for(int i = 1; i <=10; i++)
            tuition = tuition * (1 + rate);
        System.out.println("The tuition fee in ten years is " + tuition);

        for(int year =1; year <=4;year++) {
            fyrstottuit += tuition;}
        System.out.println("the total tuition fee for four years is " + fyrstottuit);

    }
}
