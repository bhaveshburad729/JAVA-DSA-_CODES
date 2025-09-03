// Java program to implement Bubble Sort
public class BubbleSortExample {

    // Function to perform bubble sort
    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Utility function to print array
    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Unsorted Array:");
        printArray(arr);

        bubbleSort(arr); // Sorting

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
