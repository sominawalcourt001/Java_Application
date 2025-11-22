import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KnightsTourRandom {
    private static final int SIZE = 8;
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical   = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] board = new int[SIZE][SIZE];
        int currentRow = 0;
        int currentCol = 0;
        int moveCount = 1;

        board[currentRow][currentCol] = moveCount;

        while (true) {
            List<Integer> legalMoves = new ArrayList<>();
            for (int i = 0; i < 8; i++) {
                int nextRow = currentRow + vertical[i];
                int nextCol = currentCol + horizontal[i];
                if (nextRow >= 0 && nextRow < SIZE && nextCol >= 0 && nextCol < SIZE && board[nextRow][nextCol] == 0) {
                    legalMoves.add(i);
                }
            }

            if (legalMoves.isEmpty()) break; // no legal moves
            int move = legalMoves.get(rand.nextInt(legalMoves.size()));
            currentRow += vertical[move];
            currentCol += horizontal[move];
            moveCount++;
            board[currentRow][currentCol] = moveCount;
        }

        // Display the final board
        printBoard(board);
        System.out.println("Moves made: " + moveCount);
    }

    private static void printBoard(int[][] board) {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                System.out.printf("%2d ", board[r][c]);
            }
            System.out.println();
        }
    }
}
