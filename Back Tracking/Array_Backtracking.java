class Array_Backtracking {

    // Function to print subsets
    public static void printSubsets(int arr[], int index, String curr) {
        // Base case: if we reach end of array
        if (index == arr.length) {
            System.out.println(curr);
            return;
        }

        // Choice 1: Include the current element
        printSubsets(arr, index + 1, curr + arr[index] + " ");

        // Choice 2: Exclude the current element
        printSubsets(arr, index + 1, curr);
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3};
        System.out.println("All subsets of the array:");
        printSubsets(arr, 0, "");
    }
}
