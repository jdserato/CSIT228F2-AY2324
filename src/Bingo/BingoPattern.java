package Bingo;

import java.util.ArrayList;
import java.util.List;

public abstract class BingoPattern implements Runnable{
    List<BingoChecker> checkers;
    BingoCard card;

    public BingoPattern(BingoCard card) {
        this.card = card;
        checkers = new ArrayList<>();
    }

    @Override
    public void run() {
        /* TODO
        - creates threads for BingoCheckers
        - starts them all at once
        - waits for all the threads to finish and when done,
            - declare bingo
            - output "Card [id] completes pattern" while printing all elements in card form
            - stops all other threads
        - can be interrupted and when so, output "Card [id] loses"
         */
        Thread[] threads = new Thread[checkers.size()];
        for (int i = 0; i < checkers.size(); i++) {
            threads[i] = new Thread(checkers.get(i));
        }
        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Card " + card.id + " loses");
                for (Thread t1 : threads) {
                    t1.interrupt();
                }
                return;
            }
        }
        BingoGame.bingo = true;
        System.out.println("Card " + card.id + " completes pattern " + this.getClass().toString());
        System.out.println(card);

    }
}
