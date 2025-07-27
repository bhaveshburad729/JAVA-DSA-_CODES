// package BITWISE OPERATOR;

public class Odd_even {
    public static void oddOrEven(int bit ){
        int num = 1;
        if ((bit & num)== 1){
            System.out.println("Number is odd");

        }else {
            System.out.println("Number is even");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
    }
}
