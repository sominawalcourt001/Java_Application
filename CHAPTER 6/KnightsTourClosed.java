import java.util.ArrayList;
import java.util.List;

public class KnightsTourClosed {
    private static final int SIZE = 8;
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical   = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        int[][] board = new int[SIZE][SIZE];
        int startRow = 0;
        int startCol = 0;
        int currentRow = startRow;
        int currentCol = startCol;
        board[currentRow][currentCol] = 1; // first move
        int moveCount = 1;

        while (moveCount < SIZE * SIZE) {
            List<Integer> candidates = new ArrayList<>();
            int minAccessibility = 9;

            // Find candidate moves with lowest accessibility
            for (int i = 0; i < 8; i++) {
                int nextRow = currentRow + vertical[i];
                int nextCol = currentCol + horizontal[i];
                if (isValidMove(nextRow, nextCol, board)) {
                    int access = countNextMoves(nextRow, nextCol, board);
                    if (access < minAccessibility) {
                        minAccessibility = access;
                        candidates.clear();
                        candidates.add(i);
                    } else if (access == minAccessibility) {
                        candidates.add(i);
                    }
                }
            }

            if (candidates.isEmpty()) break; // no legal moves
            int move = candidates.get(0); // pick first candidate (could add tie-breaking)
            currentRow += vertical[move];
            currentCol += horizontal[move];
            moveCount++;
            board[currentRow][currentCol] = moveCount;
        }

        // Display board
        printBoard(board);
        System.out.println("Total moves made: " + moveCount);

        // Check if it's a closed tour
        if (moveCount == SIZE * SIZE && isOneMoveAway(currentRow, currentCol, startRow, startCol)) {
            System.out.println("This is a CLOSED tour!");
        } else if (moveCount == SIZE * SIZE) {
            System.out.println("This is a FULL tour but NOT closed.");
        } else {
            System.out.println("Tour did NOT complete.");
        }
    }

    private static boolean isValidMove(int r, int c, int[][] board) {
        return r >= 0 && r < SIZE && c >= 0 && c < SIZE && board[r][c] == 0;
    }

    private static int countNextMoves(int row, int col, int[][] board) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int nr = row + vertical[i];
            int nc = col + horizontal[i];
            if (isValidMove(nr, nc, board)) count++;
        }
        return count;
    }

    private static boolean isOneMoveAway(int r1, int c1, int r2, int c2) {
        for (int i = 0; i < 8; i++) {
            if (r1 + vertical[i] == r2 && c1 + horizontal[i] == c2) return true;
        }
        return false;
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
