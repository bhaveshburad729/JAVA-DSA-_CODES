import  java . util.* ;
class binToDec {
    public static void binToDecs(int binary ) {
        // int binary ;
        int myno = binary ;
        int power = 0 ;
        int Decimal = 0;
        while (binary>0) {
            int last_digit = binary % 10;
         Decimal = Decimal + (last_digit * (int) Math.pow (2,power));
         power ++ ;
         binary = binary / 10 ; 
        }
        
        System.out.println("Decimal of binary no "+myno +" is - "+ Decimal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no to which we have to convert the no - ");
        int binary = sc.nextInt();
        binToDecs(binary);
        sc.close();
    }
}