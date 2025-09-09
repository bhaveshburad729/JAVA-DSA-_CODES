public class NQueens {

    // Function to check if placing a Queen at (row, col) is safe
    public static boolean isSafe(char board[][], int row, int col) {
        // Check vertical column (upward direction only, since below rows are empty)
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false; // Another Queen already in the same column
            }
        }

        // Check left diagonal (upward)
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false; // Another Queen already on left diagonal
            }
        }

        // Check right diagonal (upward)
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false; // Another Queen already on right diagonal
            }
        }

        // If no conflicts found, it's safe to place a Queen
        return true;
    }

    // Recursive function to solve N-Queens problem
    public static void nQueens(char board[][], int row) {
        // Base case: If all rows are filled, print the solution
        if (row == board.length) {
            printboard(board);
            return;
        }

        // Try placing a Queen in every column of the current row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                // Place Queen
                board[row][j] = 'Q';

                // Recurse for next row
                nQueens(board, row + 1);

                // Backtrack (remove Queen and try another position)
                board[row][j] = 'x';
            }
        }
    }

    // Function to print the chess board
    public static void printboard(char board[][]) {
        System.out.println("-----Chess Board-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 8; // Size of the chess board (8x8 for classic problem)

        // Initialize chess board with 'x' (empty cells)
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        // Start solving from row 0
        nQueens(board, 0);
    }
}
 // code logic 
 /* Place N Queens on an N x N chessboard so that no two Queens attack each other.

Queens attack vertically, and diagonally (both left and right).

🔑 Logic of the Code

Chessboard Initialization

The board is represented by a 2D array char board[][].

Initially, all cells are filled with 'x' (empty).

Recursive Function (nQueens)

The algorithm works row by row.

At each row, try placing a Queen ('Q') in each column one by one.

For every position (row, col), check if it’s safe using isSafe().

If safe → place Queen and move to next row (row+1).

If not safe → skip that column and try next.

When we reach the last row (row == n), it means all Queens are placed successfully → print the board.

Safety Check (isSafe)
For any position (row, col):

Vertical Check: Look upwards in the same column. If a Queen exists, not safe.

Left Diagonal Check: Look upward-left diagonal. If a Queen exists, not safe.

Right Diagonal Check: Look upward-right diagonal. If a Queen exists, not safe.

If all checks pass → safe to place a Queen.

Backtracking

If a Queen is placed and further recursion fails to find a solution, remove that Queen ('x') and try another column.

This ensures we explore all possible valid placements.

Printing the Solution

Whenever a valid arrangement of N Queens is found, print the board.

⚡ Example (N=4)

For a 4x4 board:

Place Queen in row 0 → multiple options.

Check each option recursively for row 1.

If no valid position found in a later row → backtrack to previous row, remove Queen, and try a new position.

Continue until all 4 Queens are placed safely.

One valid solution looks like:

Q x x x
x x Q x
x Q x x
x x x Q  */