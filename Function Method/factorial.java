import java . util. *;
public class factorial {
    public static int factorials(int n ){
        int fact = 1;
        for ( int i = 1 ; i<=n;i++){
            fact = fact * i;
            
        }
        return fact ;
        //System.out.println(fact);
    }
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no whose factorial is to be calculated - ");
        int n = sc.nextInt();
        int f = factorials(n);
        System.out.println(f);
        sc.close();
    }
}
