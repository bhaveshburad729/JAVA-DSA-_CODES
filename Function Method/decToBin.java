import java.util.Scanner;

public class decToBin {
    public static void decToBins(int dec) {
        int myno = dec;
        int pow = 0;
        int bin = 0;
        while (dec > 0) {
            int rem = dec % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            dec = dec / 2;

        }
         System.out.println("Decimal of binary no "+myno +" is - "+ bin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to which we have to convert the no - ");
        int dec = sc.nextInt();
        decToBins(dec);
        sc.close();
    }
}
