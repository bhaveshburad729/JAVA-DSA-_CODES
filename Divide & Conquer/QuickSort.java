public class QuickSort {
    public static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element is alreday getten as pivot
        int pidx = partition(arr, si, ei);
        // leftpart
        quickSort(arr, si, pidx - 1);
        // right part
        quickSort(arr, pidx + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for smaller element than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // place the pivot at correct position
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
