class Dec {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("BElow are no in decending order  - ");
        int n = 10;
        printDec(n);
    }
}