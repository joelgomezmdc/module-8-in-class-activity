public class Card {

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

    @Override
    public String toString() {
        return value + " of " + suitToName(suit);
    }

    private String suitToName(char s) {
        return switch (s) {
            case 's' -> "Spades";
            case 'h' -> "Hearts";
            case 'd' -> "Diamonds";
            case 'c' -> "Clubs";
            default -> "Unknown";
        };
    }

    public static void main(String[] args) {
        Card card1 = new Card('h', 0);
        Card card2 = new Card('d', 14);
        Card card3 = new Card('s', 10);

        System.out.println("Testing Card validation:");
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
    }
}