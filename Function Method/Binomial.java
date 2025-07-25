import java.util.*;

public class Binomial {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void Binomails (int n , int r ){
        int a = factorial(n);
        int b = factorial (r);
        int c = factorial (n-r);
        System.out.println(("Binomail coefficeint is -" +(a/(b*c))));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binomial Coefficient n -  ");
        int n = sc.nextInt();
        System.out.println("Enter the Binomial Coefficient r -  ");
        int r = sc.nextInt();
        // int Binomial = (factorial (n)) / ((factorial(r)) *(factorial(n-r))) ;
        // System.out.println("Binomail coefficeint is - "+Binomial);
        Binomails(n, r);
        sc.close();
    }

}
