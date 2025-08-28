public class TilingProblem {
    public static int tilingSol(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        int fnm1 = tilingSol(n - 1);
        // horizontal choice
        int fnm2 = tilingSol(n - 2);
        int totalways = fnm1 + fnm2;
        return totalways;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingSol(n));
    }
}
