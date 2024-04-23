package Bingo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BingoCard {
    List<Integer> numbers;
    int[][] nums;
    int id;

    public BingoCard(int id) {
        this.id = id;
        nums = new int[5][5];
        Random r = new Random();
        numbers = new ArrayList<>();
        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 5; row++) {
                if (row == 2 && col == 2) {
                    continue;
                }
                int rand;
                do {
                    rand = (15 * col) + r.nextInt(15) + 1;
                } while (numbers.contains(rand));
                numbers.add(rand);
                nums[row][col] = rand;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
//                sb.append(numbers.get(col*5+row)).append("\t");
                sb.append(nums[row][col]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
