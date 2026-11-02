public class Assignment1_Qn6 {
    public static void main(String[]args) {
        System.out.println("The Approximate Number Of PI-1 : "
                + 4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11));
        System.out.println("The Approximate Number Of PI-2: "
                + 4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13));

        System.out.println("The Approximate Number Of PI-3 : "
                + 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11));

        System.out.println("The Approximate Number Of PI-4: "
                + 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13));
    }
}
