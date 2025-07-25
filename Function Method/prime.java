import java.util.*;

public class prime {
    public static boolean isprime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                return false;
            }
        }
        return true;

    }
    public static void printPrime(int n){
        for (int i = 2; i<= n;i++){
            if (isprime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enetr the prime no - ");
        // int n = sc.nextInt();
        System.out.println("Enetr the no till which you want to print prime no - ");
        int na = sc.nextInt();
        // System.out.println(isprime(n));
        printPrime(na);
        sc.close();
    }
}
