

public class Spiral {
    public static void printspiral(int matrix[][]) {
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length - 1;
        int EndCol = matrix[0].length - 1;
        while (StartRow <= EndRow && StartCol <= EndCol) {
            // top
            for (int j = StartCol; j <= EndCol; j++) {
                System.out.print(matrix[StartRow][j] + " ");
            }
            // right
            for (int i = StartRow = 1; i <= EndRow; i++) {
                System.out.print(matrix[i][EndCol] + " ");
            }
            // bottom
            for (int j = EndCol - 1; j >= StartCol; j--) {
                if (StartRow == EndRow)
                    break; // to avoid printing the same row again
                System.out.print(matrix[EndRow][j] + " ");
            }
            // left
            for (int i = EndRow - 1; i >= StartRow + 1; i--) {
                if (StartCol == EndCol)
                    break; // to avoid printing the same column again
                System.out.print(matrix[i][StartCol] + " ");
            }
            StartRow++;
            StartCol++; 
            EndRow--;
            EndCol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        printspiral(matrix);
    }
}
