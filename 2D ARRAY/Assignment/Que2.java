class Que2 {
    //this code is by me but time complexity is = O(n^2) it is not optemised 


    // public static int SumOF2Row(int array[][]) {
    //     int sum = 0;
    //     for (int i = 0; i < array.length; i++) {
    //         for (int j = 0; j < array[0].length; j++) {
    //             if (i == 1) {
    //                 sum += array[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }

    // optimised code with time complexity = O(n)is = 
    public static int SumOF2Row(int array[][]) {
        int sum = 0;
        for(int i = 0;i<array[0].length;i++){
            sum += array[1][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int array[][] = { { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 } };
        System.out.println(SumOF2Row(array));
    }
}