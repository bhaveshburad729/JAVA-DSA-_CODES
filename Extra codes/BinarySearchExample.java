// Binary Search in Java (DSA Example)
// ------------------------------------
// Problem: Given a sorted array, search for a target element using Binary Search.
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class BinarySearchExample {

    // Function to perform Binary Search COde 
    // Parameters:
    // arr[] -> sorted array of integers
    // target -> element to search
    // Returns the index of target if found, else -1
    public static int binarySearch(int arr[], int target) {
        
        int left = 0;                // Start index of the array
        int right = arr.length - 1;  // End index of the array

        // Loop until the search space is exhausted
        while (left <= right) {
            
            // Calculate the middle index
            // (left + right) / 2 could cause overflow, 
            // so we use: left + (right - left) / 2
            int mid = left + (right - left) / 2;

            // Case 1: Target is found at mid
            if (arr[mid] == target) {
                return mid; // return index
            }

            // Case 2: Target is smaller -> Search in left half
            else if (arr[mid] > target) {
                right = mid - 1;
            }

            // Case 3: Target is larger -> Search in right half
            else {
                left = mid + 1;
            }
        }

        // If we reach here, target is not present in array
        return -1;
    }

    // Driver code (main method)
    public static void main(String[] args) {
        // Sorted array (Binary Search works only on sorted arrays)
        int arr[] = {2, 4, 7, 10, 15, 20, 27, 35, 40,50};

        int target = 15; // Element to search

        // Call binary search function
        int result = binarySearch(arr, target);

        // Display result
        if (result == -1) {
            System.out.println("Element " + target + " not found in array.");
        } else {
            System.out.println("Element " + target + " found at index " + result);
        }
    }
}
