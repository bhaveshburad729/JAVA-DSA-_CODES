public class Suduku {
    public static boolean isSafe(int suduku[][], int row, int col, int digit) {
        // row
        for (int j = 0; j < 9; j++) {
            if (suduku[row][j] == digit) {
                return false;
            }
        }
        // col
        for (int i = 0; i < 9; i++) {
            if (suduku[i][col] == digit) {
                return false;
            }
        }
        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (suduku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudukuSolver(int suduku[][], int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }
        // kaam
        int nextrow = row;
        int nextcol = col + 1;
        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }
        if (suduku[row][col] != 0) {
            return sudukuSolver(suduku, nextrow, nextcol);
        }
        for (int digit = 1; digit <=9; digit++) {
            if (isSafe(suduku, row, col, digit)) {
                suduku[row][col] = digit;
                if (sudukuSolver(suduku, nextrow, nextcol)) {
                    return true;
                }
                suduku[row][col] = 0;
            }

        }
        return false;
    }

    public static void PrintSuduku(int suduku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(suduku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int suduku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        if (sudukuSolver(suduku, 0, 0)) {
            System.out.println("Solution Exits ");
            PrintSuduku(suduku);
        } else {
            System.out.println("Solution does not exits ");
        }
    }
}
