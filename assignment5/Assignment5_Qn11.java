package assignment5;
public class Assignment5_Qn11 {
    public static void main(String[]args ){
        int count = 0;
        for(int i = 100 ; i <= 200 ; i++) {
            if(i % 3 == 0 ^ i % 4 == 0) {
                System.out.printf("%d ", i);
                count++;
                if(count % 10 == 0)
                    System.out.print("\n");
            }
        }
    }
}

