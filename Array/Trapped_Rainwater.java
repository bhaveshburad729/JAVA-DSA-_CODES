public class Trapped_Rainwater {
    public static void Rainwater(int height[]) {
        int n = height.length;
        // calculate leftmost boundary
        int left[] = new int[n];
        left[0] = height[0];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);

        }
        // calculate rightmost boundary
        int right[] = new int[n];
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            // calculate waterlevel
            int waterlevel = Math.min(right[i], left[i]);
            // calculate water trapped
            trappedwater += waterlevel - height[i];
        }
        System.out.println("Trapped Water: " + trappedwater);

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        Rainwater(height);
    }
}
