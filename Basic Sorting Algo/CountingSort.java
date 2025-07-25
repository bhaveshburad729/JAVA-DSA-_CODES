public class CountingSort {
    // Method to perform Counting Sort
    public static void Counting_Sort(int array[]) {
        // Step 1: Find the largest element in the array
        // 'largest' will store the maximum value to determine size of 'count' array
        int largest = Integer.MIN_VALUE; 
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]); // update largest if array[i] is bigger
        }

        // Step 2: Create a count array of size 'largest + 1'
        // Each index of 'count' will represent a number and store how many times it appears
        int count[] = new int[largest + 1];

        // Step 3: Count the frequency of each number in 'array'
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;  // increment count at index = array[i]
        }

        // Step 4: Place numbers back into original array in sorted order
        int j = 0; // 'j' is the index for original array
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {  // if count[i] > 0, it means number 'i' is present
                array[j] = i;       // place 'i' in the original array
                j++;                // move to next position
                count[i]--;         // decrease count because one 'i' is placed
            }
        }
    }

    // Method to print the array
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example array to sort
        int array[] = { 5, 4, 1, 3, 2 };

        System.out.print("Original Array: ");
        printArray(array);

        // Sorting the array using Counting Sort
        Counting_Sort(array);

        System.out.print("Sorted Array:   ");
        printArray(array);
    }
}



// public class CountingSort {
//     public static void Counting_Sort(int array[]) {
//         // Step 1: Find the largest element in the array
//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i < array.length; i++) {
//             largest = Math.max(largest, array[i]);
//         }
//         // Dry run example for array = {5, 4, 1, 3, 2}
//         // i=0 -> largest = max(-∞, 5) = 5
//         // i=1 -> largest = max(5, 4) = 5
//         // i=2 -> largest = max(5, 1) = 5
//         // i=3 -> largest = max(5, 3) = 5
//         // i=4 -> largest = max(5, 2) = 5
//         // Final largest = 5

//         // Step 2: Create count array of size (largest + 1)
//         int count[] = new int[largest + 1];
//         // count = [0, 0, 0, 0, 0, 0] (indices 0 to 5)

//         // Step 3: Count frequency of each number
//         for (int i = 0; i < array.length; i++) {
//             count[array[i]]++;
//         }
//         // Dry run for counting:
//         // array[0]=5 -> count[5]++ => [0, 0, 0, 0, 0, 1]
//         // array[1]=4 -> count[4]++ => [0, 0, 0, 0, 1, 1]
//         // array[2]=1 -> count[1]++ => [0, 1, 0, 0, 1, 1]
//         // array[3]=3 -> count[3]++ => [0, 1, 0, 1, 1, 1]
//         // array[4]=2 -> count[2]++ => [0, 1, 1, 1, 1, 1]

//         // Step 4: Place elements back in sorted order
//         int j = 0;
//         for (int i = 0; i < count.length; i++) {
//             while (count[i] > 0) {
//                 array[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//         // Dry run for reconstructing:
//         // i=0 -> count[0]=0 (skip)
//         // i=1 -> count[1]=1 -> array[0]=1, count[1]=0
//         // i=2 -> count[2]=1 -> array[1]=2, count[2]=0
//         // i=3 -> count[3]=1 -> array[2]=3, count[3]=0
//         // i=4 -> count[4]=1 -> array[3]=4, count[4]=0
//         // i=5 -> count[5]=1 -> array[4]=5, count[5]=0
//         // Final array = [1, 2, 3, 4, 5]
//     }

//     public static void printArray(int array[]) {
//         for (int i = 0; i < array.length; i++) {
//             System.out.print(array[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int array[] = {5, 4, 1, 3, 2};

//         System.out.print("Original Array: ");
//         printArray(array);

//         Counting_Sort(array);

//         System.out.print("Sorted Array:   ");
//         printArray(array);
//     }
// }
