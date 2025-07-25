import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the first no - ");
        int a = sc.nextInt();
        System.out.println("Eneter the second no - ");
        int b = sc.nextInt();
        System.out.println("Eneter the operator choice  - ");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("Enter the operator - ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("The sum is - " + (a + b));
                break;
            case 2:
                System.out.println("The difference is - " + (a - b));
                break;
            case 3:
                System.out.println("The product is - " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("The division is - " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}
