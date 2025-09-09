public class NQueensCounting {

    static int count = 0; // to keep track of total solutions

    // Function to check if placing a Queen at (row, col) is safe
    public static boolean isSafe(char board[][], int row, int col) {
        // Check vertical column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true; // Safe to place
    }

    // Recursive function to solve N-Queens
    public static void nQueens(char board[][], int row) {
        // Base case: All rows are filled
        if (row == board.length) {
            count++; // found one valid solution
            printboard(board);
            return;
        }

        // Try placing a Queen in every column of this row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // place Queen
                nQueens(board, row + 1); // solve for next row
                board[row][j] = 'x'; // backtrack
            }
        }
    }

    // Print board arrangement
    public static void printboard(char board[][]) {
        System.out.println("-----Chess Board-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 8; // size of chess board
        char board[][] = new char[n][n];

        // initialize board with 'x'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        // solve
        nQueens(board, 0);
        System.out.println("Total solutions = " + count);
    }
}
