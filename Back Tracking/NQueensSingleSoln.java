public class NQueensSingleSoln {

    // Check if placing a Queen at (row, col) is safe
    public static boolean isSafe(char board[][], int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    // Recursive function to find one solution
    public static boolean nQueens(char board[][], int row) {
        // Base case: If all rows are filled → print and stop
        if (row == board.length) {
            printboard(board);
            return true; // found one solution
        }

        // Try placing a Queen in every column of this row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // place Queen

                // Recurse for next row
                if (nQueens(board, row + 1)) {
                    return true; // stop recursion once a solution is found
                }

                board[row][j] = 'x'; // backtrack
            }
        }
        return false; // no solution found in this path
    }

    // Print the chess board
    public static void printboard(char board[][]) {
        System.out.println("-----Chess Board (Single Solution)-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 8; // Size of the chess board
        char board[][] = new char[n][n];

        // Initialize board with 'x'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        // Solve and print only one solution
        if (!nQueens(board, 0)) {
            System.out.println("No solution exists.");
        }
    }
}
// logic --------------------
/*
 * 🎯 Problem
 * 
 * We want to place N Queens on an N x N chessboard such that no two Queens
 * attack each other, but instead of printing all solutions, we need to stop
 * after finding the first valid solution.
 * 
 * 🔑 Logic of the Code
 * 
 * Board Setup
 * 
 * Represent the chessboard as a 2D array board[n][n].
 * 
 * Initially, all cells contain 'x' (empty).
 * 
 * Recursive Function (nQueens)
 * 
 * Start from the first row (row = 0).
 * 
 * For the current row, try placing a Queen in each column one by one.
 * 
 * Before placing, call isSafe(row, col) to check if the position is valid.
 * 
 * If safe → place Queen and recursively solve for the next row (row + 1).
 * 
 * If a solution is found, return true immediately to stop further searching.
 * 
 * If no placement works, backtrack by removing the Queen ('x').
 * 
 * Safety Check (isSafe)
 * For (row, col), check only upward directions because lower rows are empty:
 * 
 * Vertical column check → No Queen above in the same column.
 * 
 * Left diagonal check → No Queen on upper-left diagonal.
 * 
 * Right diagonal check → No Queen on upper-right diagonal.
 * 
 * If all checks pass → position is safe.
 * 
 * Base Case
 * 
 * If row == n, it means all rows are filled → a valid solution is found.
 * 
 * Print the chessboard and return true to stop recursion.
 * 
 * Termination (Single Solution)
 * 
 * Since nQueens returns true as soon as a solution is found, recursion stops
 * immediately.
 * 
 * This ensures only one valid arrangement is printed.
 * 
 * ⚡ Example (N=4)
 * 
 * One possible single solution:
 * 
 * Q x x x
 * x x Q x
 * x Q x x
 * x x x Q
 * 
 * 
 * ✅ Core Idea:
 * This is a backtracking algorithm with an early stop condition.
 * 
 * Unlike the normal N-Queens which prints all solutions, here recursion returns
 * true after the first valid solution, halting further exploration.
 */