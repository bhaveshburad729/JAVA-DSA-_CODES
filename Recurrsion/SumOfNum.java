import java.util.*;

public class SumOfNum {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int summ = n + sum(n - 1);
        return summ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first n natural no -");
        int n = sc.nextInt();
        System.out.println("Sum of n natural no is = "+sum(n));
        sc.close();
    }
}
