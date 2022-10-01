package War;

import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] cards;

    public Deck() {
        cards = new Card[52];
        String[] suits = {"\u2660", "\u2665", "\u2666", "\u2663"};
        String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < names.length; j++) {
                int position = (i * names.length) + j;
                cards[position] = new Card(suits[i], j, names[j]);
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            int currentPosition = i;
            int newPosition = random.nextInt(cards.length);
            Card temp = cards[newPosition];
            cards[newPosition] = cards[currentPosition];
            cards[currentPosition] = temp;
        }

    }

    public Card[] dealPlayer1Hand() {
        return Arrays.copyOfRange(cards, 0, cards.length / 2);
    }

    public Card[] dealPlayer2Hand() {
        return Arrays.copyOfRange(cards, cards.length / 2, cards.length );
    }


    @Override
    public String toString() {
        return Arrays.toString(cards);
    }
}
