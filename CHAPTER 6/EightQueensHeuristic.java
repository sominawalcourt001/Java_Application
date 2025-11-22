public class EightQueensHeuristic {
    private static final int SIZE = 8;
    private static int[][] board = new int[SIZE][SIZE];

    public static void main(String[] args) {
        if (placeQueens(0)) {
            printBoard();
        } else {
            System.out.println("No solution found.");
        }
    }

    // Try to place queens row by row
    private static boolean placeQueens(int row) {
        if (row == SIZE) return true; // all queens placed

        // Find column with minimal elimination number in this row
        int minElim = SIZE * SIZE;
        int bestCol = -1;

        for (int col = 0; col < SIZE; col++) {
            if (isSafe(row, col)) {
                int elim = eliminationNumber(row, col);
                if (elim < minElim) {
                    minElim = elim;
                    bestCol = col;
                }
            }
        }

        if (bestCol == -1) return false; // no safe place

        // Place queen
        board[row][bestCol] = 1;

        if (placeQueens(row + 1)) return true;

        // Backtrack
        board[row][bestCol] = 0;
        return false;
    }

    // Check if square (row,col) is safe
    private static boolean isSafe(int row, int col) {
        // Check column
        for (int r = 0; r < row; r++) if (board[r][col] == 1) return false;

        // Check diagonals
        for (int r = 0; r < row; r++) {
            int diff = row - r;
            if (col - diff >= 0 && board[r][col - diff] == 1) return false;
            if (col + diff < SIZE && board[r][col + diff] == 1) return false;
        }

        return true;
    }

    // Estimate elimination number (number of squares attacked)
    private static int eliminationNumber(int row, int col) {
        int count = 0;
        // Count attacked squares in future rows
        for (int r = row + 1; r < SIZE; r++) {
            count++; // same column
            int diff = r - row;
            if (col - diff >= 0) count++; // left diagonal
            if (col + diff < SIZE) count++; // right diagonal
        }
        return count;
    }

    private static void printBoard() {
        System.out.println("Solution:");
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                System.out.print(board[r][c] == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}
