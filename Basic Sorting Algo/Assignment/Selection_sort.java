public class Selection_sort {
    public static void SelectionSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // let ith element be the minimum
            int min = i;                            // 0, 1, 2, 3, 3 -> index 
            for (int j = i + 1; j <= n - 1; j++) { //  5, 4, 1, 3, 2 };
                if (array[min] < array[j]) { // 5 < 4 
                    min = j; // 0 = 1 ; 
                }
            }
            // swap
            int temp = array[min]; // temp = 5
            array[min] = array[i]; // array[0] = 4
            array[i] = temp; // array[1] = 5

        }

    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2 };
        SelectionSort(array);
        printArray(array);
    }
}
