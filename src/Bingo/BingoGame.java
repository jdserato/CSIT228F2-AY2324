package Bingo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BingoGame implements Runnable{
    static Boolean[] result;
    static boolean bingo; // make this shared
    List<BingoCard> cards;

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many players? ");
        int num = sc.nextInt();
        // TODO get a number and create that number of cards
        // TODO and store them in the list of cards.
        cards = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            cards.add(new BingoCard(i+1));
        }
        for (BingoCard card : cards) {
            System.out.println("Card " + card.id);
            System.out.println(card);
        }
        List<Thread> threads = new ArrayList<>();
        for (BingoCard card : cards) {
            threads.add(new Thread(new BingoPatternPlus(card)));
        }
        for (Thread t : threads) {
            t.start();
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
        Random r = new Random();
        result = new Boolean[76];
        result[0] = true;
        for (int i = 1; i < 76; i++) {
            result[i] = false;
        }
        while (!bingo) {
            int n;
            do {
                n = r.nextInt(75) + 1;
                System.out.println(n + " is random");
            } while (result[n]);
            result[n] = true;
            System.out.println("Number " + n);
            System.out.println("Result: ");
            for (int i = 1; i < 75; i++) {
                if (result[i]) {
                    System.out.print(i +" ");
                }
            }
            System.out.println();
            synchronized (result) {
                result.notifyAll();
            }
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
            }
        }
        // STOP other threads
        for (Thread t : threads) {
            t.interrupt();
        }
    }
}
