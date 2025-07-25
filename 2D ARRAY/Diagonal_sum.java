public class Diagonal_sum {
    public static void Diagonal_sums(int matrix[][]){
        int sum = 0;
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[0].length;j++ ){
                //primary diagonal 
                if(i==j){
                    sum = sum + matrix [i][j];
                }
                //secondary diagonal 
                else if (i+j == matrix.length - 1){
                    sum = sum +  matrix[i][j];
                }
            }
        }
        System.out.println("Sum of Diagonal is = "+ sum);
    }
    public static void printarr(int matrix [] []){
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[0].length;j++ ){
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        Diagonal_sums(matrix);
        printarr(matrix);
    }
}
