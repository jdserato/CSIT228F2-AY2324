package Bingo;

public class BingoRowChecker extends BingoChecker{
    int row;

    public BingoRowChecker(BingoCard card, int row) {
        super(card);
        this.row = row-1;
    }

    @Override
    public void run() {
        for (int col = 0; col < 5; col++) {
            int num = card.nums[row][col];
            System.out.println("Card " + card.id + " - checking " + num);
            while (!BingoGame.result[num]) {
                try {
                    synchronized (BingoGame.result) {
                        BingoGame.result.wait();
                    }
                } catch (InterruptedException e) {
                    System.out.println("Card " + card.id + " loses waiting for " + num + " at row " + (row+1));
                }
            }
        }
        System.out.println("Card " + card.id + " - completes row " + (row+1));
    }
}
