class PrintSubsets {
    public static void printSubsets(String str, int i, String ans) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
                return;
            } else {
                System.out.println(ans);
                return;
            }
        }
        // kaam
        // yes choice
        printSubsets(str, i + 1, ans + str.charAt(i));
        // no choice
        printSubsets(str, i + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, 0, "");
    }
}