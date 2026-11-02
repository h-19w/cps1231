package assignment5;
public class Assignment5_Qn22_num_of_heandNtails {
    public static void main(String[]args){
        int numberofheads, numberoftails;
    numberofheads = 0;
    numberoftails = 0;

    for (int i = 1;i <= 1000000; i++) {
        if((int)(Math.random()*2) == 0)
            numberofheads++;
        else
            numberoftails++;
    }
    System.out.printf("The number of the heads is %d\n", "");
    System.out.printf("The number of the tails is %d\n", " ");
    }

}
