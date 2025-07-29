public class Counting {
    public static void Counting_Sort(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<array.length;i++){
            largest = Math.max(largest, array[i]);
        }
        int count [] = new int [largest+1];
        for(int i = 0;i<array.length;i++){
            count[array[i]]++;
        }
          int j = 0;
        for (int i = count.length - 1; i >= 0; i--) { // Loop reversed for descending
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArray(int array[]){
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2 };
        Counting_Sort(array);
        printArray(array);
    }
}
