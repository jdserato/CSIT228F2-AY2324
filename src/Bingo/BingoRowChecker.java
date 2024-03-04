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
            int num = card.numbers.get(col*5+row);
//            int num = card.nums[row][col];
            BingoGame.result.wait();
        }
    }
}
