public class LastOccurrence {
    public static int lastOcc(int arr[], int key, int i) {
        // Base case
        if (i == arr.length) {
            return -1;
        }
        
        // Recursive call first
        int found = lastOcc(arr, key, i + 1);

        // If found in later part → return that
        if (found != -1) {
            return found;
        }

        // Otherwise check current index
        if (arr[i] == key) {
            return i;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 5};
        int key = 2;
        System.out.println(lastOcc(arr, key, 0));  // Output → 4
    }
}
