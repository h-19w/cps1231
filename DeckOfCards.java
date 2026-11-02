public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
            // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        shuffle(deck);
            // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }

    }
    public static int[] shuffle(int[] array)  {
        for (int i = 0; i < array.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * array.length);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }
}