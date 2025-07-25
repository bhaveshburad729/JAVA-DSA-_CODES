public class bubble_sort {
    public static void BubbleSort(int array[]) {
        int n = array.length;
        for (int turn = 0; turn < n - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < n - 1 - turn; j++) {
                
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                System.out.println("array is already sorted");
                break;
            }
            System.out.println("swap of  " + turn + "  is - " + swap);
        }

    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 11, 4, 5, 6, 7, 8, 9, 10 };
        BubbleSort(array);
        printArray(array);
    }

}
