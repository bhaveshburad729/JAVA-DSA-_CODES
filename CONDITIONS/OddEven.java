import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No - ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("THe give no is even ");
        } else {
            System.out.println("The given no is odd ");
        }
        sc.close();

    }
}
