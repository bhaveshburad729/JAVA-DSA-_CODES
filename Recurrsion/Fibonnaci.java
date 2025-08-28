import java.util.*;

public class Fibonnaci {
    public static int fibonnaci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibnm1 = fibonnaci(n - 1);
        int fibnm2 = fibonnaci(n - 2);
        int fibm = fibnm1 + fibnm2;
        return fibm;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no upto which fibonnaci series is being calculated - ");
        int n = sc.nextInt();
        System.out.println("Fibonnaci series is - " + fibonnaci(n));
        sc.close();
    }
}
