import java.util.*;

class DeckOfCards {

    public static void main(String[] args) {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck = new String[52];
        int k = 0;

        for (String s : suits) {
            for (String r : ranks) {
                deck[k++] = r + " of " + s;
            }
        }

        for (int i = 0; i < deck.length; i++) {
            int rand = (int)(Math.random() * deck.length);

            String temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }

        for (String card : deck) {
            System.out.println(card);
        }
    }
}