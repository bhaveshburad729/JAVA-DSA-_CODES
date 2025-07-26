package Assignment;
    import java.util.*;
public class SumOFDigits {
    public static void SumofDigits(int n ){
        int SumOFDigits = 0;
        while(n>0){
            int lastDigits = n%10;
            SumOFDigits += lastDigits;
            n = n/10;
        }
        System.out.println("Sum of digits is : "+ SumOFDigits);
    }
    public static void main(String[]arg){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no or digits : ");
        int num = sc.nextInt();
        SumofDigits(num);
        sc.close();
    }
}
