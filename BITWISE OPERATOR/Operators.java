class Operators {
    public static int getIthbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0; // ith bit is 0
        } else {
            return 1; // ith bit is 1
        }
    }
    public static 

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(getIthbit(10, 2));
    }
}