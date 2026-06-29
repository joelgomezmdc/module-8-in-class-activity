import java.util.Random;

public class War {

    private static final char[] SUITS = {'s', 'h', 'd', 'c'};
    private static final Random RNG = new Random();

    private static char randomSuit() {
        return SUITS[RNG.nextInt(SUITS.length)];
    }

    private static int randomValue() {
        return RNG.nextInt(13) + 1;
    }

    private static char differentSuit(char current) {
        char newSuit;

        do {
            newSuit = randomSuit();
        } while (newSuit == current);

        return newSuit;
    }

    public static void main(String[] args) {

        Card player = new Card(randomSuit(), randomValue());
        Card computer = new Card(randomSuit(), randomValue());

        if (player.getSuit() == computer.getSuit()
                && player.getValue() == computer.getValue()) {
            computer.setSuit(differentSuit(computer.getSuit()));
        }

        System.out.println("Player card: " + player);
        System.out.println("Computer card: " + computer);

        if (player.getValue() == computer.getValue()) {
            System.out.println("Tie!");
        } else if (player.getValue() > computer.getValue()) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}

class Card {

    private char suit;
    private int value;

    public Card(char suit, int value) {
        this.suit = suit;
        setValue(value);
    }

    public char getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public void setValue(int value) {
        if (value < 1 || value > 13) {
            this.value = 1;
        } else {
            this.value = value;
        }
    }

    public String toString() {
        return value + " of " + suitToName(suit);
    }

    private String suitToName(char s) {
        switch (s) {
            case 's':
                return "Spades";
            case 'h':
                return "Hearts";
            case 'd':
                return "Diamonds";
            case 'c':
                return "Clubs";
            default:
                return "Unknown";
        }
    }
}