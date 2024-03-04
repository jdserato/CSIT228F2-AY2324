package Bingo;

import java.util.List;

public class BingoCard {
    List<Integer> numbers;
    int[][] nums;
    int id;

    public BingoCard(int id) {
        this.id = id;
        /* TODO to store random numbers
         * 5 random numbers each
         * B: 01-15
         * I: 16-30
         * N: 31-45 (3rd element is 0)
         * G: 46-60
         * O: 61-75
         */
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                sb.append(numbers.get(col*5+row)).append("\t");
                sb.append(nums[row][col]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
