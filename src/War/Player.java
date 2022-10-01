package War;

public class Player {
    public Card[] cards;
    public String name;
    public int score = 0;

    public Player(Card[] cards, String name) {
        this.cards = cards;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "'s score is " + score;
    }
}
