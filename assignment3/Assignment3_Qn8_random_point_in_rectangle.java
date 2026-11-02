package assignment3;
public class Assignment3_Qn8_random_point_in_rectangle {
    public static void main(String[]args) {
            int randomX = (int)(Math.random()*25)+1;
            int randomY = (int)(Math.random()*75)+1;
            int directionX =(int)(Math.random()*2);
            int directionY =(int)(Math.random()*2);

            if(directionX == 0)
                randomX *= -1;
            if(directionY == 0)
                randomY *= -1;
            System.out.println("The random point in a rectangle of width 50 and height 150 with center (0,0) is : (" + randomX + "," + randomY + ")");
    }
}
