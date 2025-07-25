public class Max_Subarrays {
    public static void max_subarray_Sum(int array[]) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                curr_sum = 0;
                for (int k = i; k <= j; k++) {
                    curr_sum = curr_sum + array[k];
                }
                System.out.println(curr_sum);
                if (curr_sum > max_sum) {
                    max_sum = curr_sum;
                }

            }
           
        }
       System.out.println("Maximum subarray sum is: " + max_sum);

    }

    public static void main(String[] args) {
        int array[] = { 1, -2, 6, -1, 3 };
        max_subarray_Sum(array);
    }
}
