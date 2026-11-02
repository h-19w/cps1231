package assignment3;

public class Assignment3_Qn11_random_card_from_deck {
    public static void main(String[] args) {
        System.out.println("You randomly pick a card from a deck of poker cards.");
        int num = (int) (Math.random() * 12);
        int suit = (int) (Math.random() * 3);
        System.out.print("The card you drew is ");

        if (num > -1 && num < 13)
            switch (num) {
                case 0:
                    System.out.print("ACE R");break;
                case 1:
                    System.out.print("2 ");break;
                case 2:
                    System.out.print("3");break;
                case 3:
                    System.out.print("4 ");break;
                case 4:
                    System.out.print("5 ");break;
                case 5:
                    System.out.print("6 ");break;
                case 6:
                    System.out.print("7 ");break;
                case 7:
                    System.out.print("8 ");break;
                case 8:
                    System.out.print("9 ");break;
                case 9:
                    System.out.print("10 ");break;
                case 10:
                    System.out.print("JACK ");break;
                case 11:
                    System.out.print("QUEEN ");break;
                case 12:
                    System.out.print("KING ");
            }
        System.out.print("of");
        switch (suit) {
            case 0:
                System.out.print(" CLUBS.");break;
            case 1:
                System.out.print(" HEARTS.");break;
            case 2:
                System.out.print(" DIAMONDS.");break;
            case 3:
                System.out.print(" SPADES.");

        }
    }
}
