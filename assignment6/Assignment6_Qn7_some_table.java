package assignment6;
public class Assignment6_Qn7_some_table {
    public static void main(String[]args) {
        System.out.println("i\t\tm(i)");
        System.out.println("___________________");
        for (int i = 0; i <= 9; i++){
            System.out.printf("%1d%10.4f\n", i * 100 + 1, m(i * 100 + 1));
        }
    }
    public static double m(int i){
        double m_i_ = 0;
        for (int j = 1; j <= i; j++)
            m_i_ += Math.pow(-1, j + 1) / (2 * j - 1);
        return m_i_ * 4;
    }
}
