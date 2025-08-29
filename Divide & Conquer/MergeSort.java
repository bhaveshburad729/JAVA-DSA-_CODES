public class MergeSort {
    public static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        // leftpart
        mergeSort(arr, si, mid);
        // right part
        mergeSort(arr, mid + 1, ei);
        // merge
        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        // left port where right is completed i.e = left part > right part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        // right part where left is completed i.e = right part > left part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy the temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 3, 7 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}