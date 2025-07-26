package Assignment;
import java.util.*;



public class Average3 {
    public static float Average(float num1, float num2, float num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float avg = Average(num1, num2, num3);
        System.out.println("The average is: " + avg);
        sc.close();
    }
}
