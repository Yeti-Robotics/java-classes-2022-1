package War;

public class Card {
    public String suit;
    public int rank;
    public String name;

    public Card(String suit, int rank, String name) {
        this.suit = suit;
        this.rank = rank;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " of " + suit;
    }
}
