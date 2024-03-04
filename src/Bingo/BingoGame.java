package Bingo;

import java.util.List;

public class BingoGame implements Runnable{
    boolean[] result;
    boolean bingo; // make this shared
    List<BingoCard> cards;

    @Override
    public void run() {
        System.out.print("How many players? ");
        // TODO get a number and create that number of cards
        // TODO and store them in the list of cards.
        for (BingoCard card : cards) {
            System.out.println("Card " + card.id);
            System.out.println(card);
        }
    }
}
