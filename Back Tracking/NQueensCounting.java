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
// logic for code

/*
 * 🎯 Problem
 * 
 * We need to place N Queens on an N x N chessboard such that:
 * 
 * No two Queens attack each other.
 * 
 * Queens attack vertically, and diagonally (left + right).
 * 
 * We must print all valid boards and also count total solutions.
 * 
 * 🔑 Logic of the Code
 * 
 * Board Setup
 * 
 * The chessboard is represented by a 2D array board[n][n].
 * 
 * Each cell is initialized with 'x' (empty).
 * 
 * Recursive Backtracking (nQueens)
 * 
 * The algorithm works row by row.
 * 
 * For the current row, try placing a Queen ('Q') in every column.
 * 
 * Before placing, call isSafe(row, col) to check if the position is safe.
 * 
 * If safe → place Queen and recursively call nQueens for the next row.
 * 
 * If we reach row == n, it means all Queens are placed → print the board and
 * increase count.
 * 
 * After recursion, backtrack by removing the Queen ('x') to explore other
 * possibilities.
 * 
 * Safety Check (isSafe)
 * For a given cell (row, col), check only above rows because below rows are
 * still empty:
 * 
 * Vertical check: No Queen in same column above.
 * 
 * Left diagonal check: No Queen on upper-left diagonal.
 * 
 * Right diagonal check: No Queen on upper-right diagonal.
 * 
 * If all checks pass → position is safe.
 * 
 * Counting Solutions
 * 
 * Each time a valid arrangement is found, increment count.
 * 
 * At the end, print Total solutions = count.
 * 
 * Output
 * 
 * Prints every valid chessboard arrangement.
 * 
 * Shows total number of ways Queens can be placed.
 * 
 * ⚡ Example (N=4)
 * 
 * One valid arrangement looks like:
 * 
 * Q x x x
 * x x Q x
 * x Q x x
 * x x x Q
 * 
 * 
 * For N=4, there are 2 total solutions.
 * For N=8, there are 92 total solutions.
 */