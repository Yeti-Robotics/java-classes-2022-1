package War;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player(deck.dealPlayer1Hand(), "Robbie");
        Player player2 = new Player(deck.dealPlayer2Hand(), "Bart");

        for (int i = 0; i < player1.cards.length; i++) {
            Card player1Card = player1.cards[i];
            Card player2Card = player2.cards[i];

            System.out.println(player1Card + " vs " + player2Card);

            if (player1Card.rank > player2Card.rank) {
                player1.score++;
            } else if (player2Card.rank > player1Card.rank) {
                player2.score++;
            } else {
                System.out.println("You both lose!");
            }
        }

        System.out.println(player1);
        System.out.println(player2);

        if (player1.score > player2.score) {
            System.out.println(player1.name + " wins!");
        } else if (player2.score > player1.score) {
            System.out.println(player2.name + " wins!");
        } else {
            System.out.println("It's a draw! You both lose!");
        }
    }
}
