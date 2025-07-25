import java.util.*;
public class Multiply {
    public static void multiply(int a , int b ){
        int product = a * b ; 
        System.out.println(product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no - ");
        int a = sc.nextInt();
        System.out.println("Enter second no - ");   
        int b = sc.nextInt();
        multiply(a, b);
        sc.close();
    }
}
