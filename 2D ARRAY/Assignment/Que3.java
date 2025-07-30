public class Que3 {

    // Function to print any 2D matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) { // Loop through each row
            for (int j = 0; j < matrix[0].length; j++) { // Loop through each column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }

    // Function to generate transpose of the matrix
    public static int[][] getTranspose(int[][] matrix, int row, int col) {
        int[][] Transpose = new int[col][row]; // Transpose will have reversed dimensions
        for (int i = 0; i < row; i++) {         // Traverse original matrix row-wise
            for (int j = 0; j < col; j++) {     // Traverse each column
                Transpose[j][i] = matrix[i][j]; // Assign transposed values
            }
        }
        return Transpose; // Return the transposed matrix
    }

    public static void main(String[] args) {
        int row = 2; // Number of rows in original matrix
        int col = 3; // Number of columns in original matrix

        // Original matrix declaration and initialization
        int[][] matrix = {
            { 2, 3, 7 },
            { 5, 6, 7 }
        };

        // Print original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Call function to get transpose of matrix
        int[][] Transpose = getTranspose(matrix, row, col);

        // Print transpose matrix
        System.out.println("Transpose Matrix:");
        printMatrix(Transpose);
    }
}
