import java.util.ArrayList;
import java.util.List;

public class KnightsTour {
    private static final int SIZE = 8;

    // All 8 possible knight moves
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical   = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        int[][] board = new int[SIZE][SIZE];           // move numbers
        int[][] accessibility = {
            {2,3,4,4,4,4,3,2},
            {3,4,6,6,6,6,4,3},
            {4,6,8,8,8,8,6,4},
            {4,6,8,8,8,8,6,4},
            {4,6,8,8,8,8,6,4},
            {4,6,8,8,8,8,6,4},
            {3,4,6,6,6,6,4,3},
            {2,3,4,4,4,4,3,2}
        };

        // Start position (can be changed)
        int currentRow = 0;
        int currentCol = 0;

        board[currentRow][currentCol] = 1; // first move
        int moveCount = 1;

        while (moveCount < SIZE * SIZE) {
            List<Integer> candidates = new ArrayList<>();
            int minAccessibility = 9;

            // Find all legal moves and their accessibility
            for (int i = 0; i < 8; i++) {
                int nextRow = currentRow + vertical[i];
                int nextCol = currentCol + horizontal[i];

                if (isValidMove(nextRow, nextCol, board)) {
                    if (accessibility[nextRow][nextCol] < minAccessibility) {
                        minAccessibility = accessibility[nextRow][nextCol];
                        candidates.clear();
                        candidates.add(i);
                    } else if (accessibility[nextRow][nextCol] == minAccessibility) {
                        candidates.add(i);
                    }
                }
            }

            if (candidates.isEmpty()) break; // no legal moves, end tour

            // Choose move with lookahead if multiple candidates
            int move = candidates.get(0);
            if (candidates.size() > 1) {
                int minNextAccess = 9;
                for (int candidate : candidates) {
                    int nextRow = currentRow + vertical[candidate];
                    int nextCol = currentCol + horizontal[candidate];
                    int nextAccess = countNextMoves(nextRow, nextCol, board, accessibility);
                    if (nextAccess < minNextAccess) {
                        minNextAccess = nextAccess;
                        move = candidate;
                    }
                }
            }

            // Make move
            currentRow += vertical[move];
            currentCol += horizontal[move];
            moveCount++;
            board[currentRow][currentCol] = moveCount;

            // Reduce accessibility of squares reachable from new position
            for (int i = 0; i < 8; i++) {
                int nr = currentRow + vertical[i];
                int nc = currentCol + horizontal[i];
                if (nr >= 0 && nr < SIZE && nc >= 0 && nc < SIZE && board[nr][nc] == 0) {
                    accessibility[nr][nc]--;
                }
            }
        }

        // Display results
        printBoard(board);
        System.out.println("Total moves made: " + moveCount);
    }

    // Check if move is on board and unvisited
    private static boolean isValidMove(int r, int c, int[][] board) {
        return r >= 0 && r < SIZE && c >= 0 && c < SIZE && board[r][c] == 0;
    }

    // Count number of next moves from a candidate square
    private static int countNextMoves(int row, int col, int[][] board, int[][] accessibility) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int nr = row + vertical[i];
            int nc = col + horizontal[i];
            if (isValidMove(nr, nc, board)) {
                count++;
            }
        }
        return count;
    }

    // Print the board
    private static void printBoard(int[][] board) {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                System.out.printf("%2d ", board[r][c]);
            }
            System.out.println();
        }
    }
}
