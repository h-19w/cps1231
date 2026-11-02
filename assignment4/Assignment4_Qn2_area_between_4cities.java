package assignment4;
public class Assignment4_Qn2_area_between_4cities {
    public static void main(String[]args ){
        double AY = -84.3879824;
        double AX = 33.7489954;

        double OY = -81.3792364999;
        double OX = 28.5383355;

        double SY = -81.09983419999998;
        double SX = 32.0835407;

        double CY = -80.84312669999997;
        double CX = 35.2270869;
//        s = (side1+ side2 + side3)/2;
//        area =sqrt(s(s-side1)(s-side2)(s-side3)
//        2 triangles = AOC, COS
        double AOC_1sideAO = Math.sqrt((AX-OX) * (AX-OX) + (AY-OY) * (AY-OY)); //double a = Math.sqrt((x2 − x3) * (x2 − x3)+ (y2 − y3) * (y2 − y3));
        double AOC_2sideOC = Math.sqrt((OX-CX) * (OX-CX) + (OY-CY) * (OY-CY));
        double AOC_3sideAC = Math.sqrt((AX-CX) * (AX-CX) + (AY-CY) * (AY-CY));

        double s1 = (AOC_1sideAO + AOC_2sideOC + AOC_3sideAC)/2;
        double AreaAOC = Math.sqrt(s1 * (s1 - AOC_1sideAO) * (s1 - AOC_2sideOC) * (s1 - AOC_3sideAC));

        double COS_1sideCO = Math.sqrt((CX-OX) * (CX-OX) + (CY-OY) * (CY-OY));
        double COS_2sideOS = Math.sqrt((OX-SX) * (OX-SX) + (OY-SY) * (OY-SY));
        double COS_3sideCS = Math.sqrt((CX-SX) * (CX-SX) + (CY-SY) * (CY-SY));

        double s2 = (COS_1sideCO + COS_2sideOS + COS_3sideCS)/2;
        double AreaCOS = Math.sqrt(s2 * (s2 - COS_1sideCO) * (s2 - COS_2sideOS) * (s2 - COS_3sideCS));

        double total_area = AreaAOC + AreaCOS;

        System.out.println("The total area of the distance between the 4 cities is " + total_area + ".");

    }
}
