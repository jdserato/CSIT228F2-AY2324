package Bingo;

import java.util.List;

public class BingoGame implements Runnable{
    static boolean[] result;
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
        // TODO loop while not bingo
        /*
        - generate a random number num
        - outputs the number chosen
        - prints out all numbers chosen numerically
        - set to true the result[num]
        - notifies those waiting for result
        - sleeps for 300 milliseconds
         */
    }
}
