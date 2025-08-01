public class Insertionsort {
    public static void InsertionSort(int array[]) {
        int n = array.length;
        for (int i = 1; i <= n - 1; i++) {
            int curr = array[i];
            int prev = i - 1;
            while (prev >= 0 && array[prev] < curr) {
                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev + 1] = curr;
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
        InsertionSort(array);
         printArray(array);
    }
}
