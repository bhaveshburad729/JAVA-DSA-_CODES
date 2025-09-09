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
