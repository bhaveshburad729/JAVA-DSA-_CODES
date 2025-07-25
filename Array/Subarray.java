public class Subarray {
    public static void Subarrays(int array[]) {
        int ts = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + ts);
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        Subarrays(array);

    }
}
