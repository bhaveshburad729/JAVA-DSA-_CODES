public class Selection_sort {
    public static void SelectionSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // let ith element be the minimum
            int min = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            // swap
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;

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
