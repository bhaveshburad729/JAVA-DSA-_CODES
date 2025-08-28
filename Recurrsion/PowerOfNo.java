public class PowerOfNo {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;

        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }
    public static int optimisedpower(int x ,int n){
        if(n == 0){
            return 1;
        }
        int halfpower = optimisedpower( x,  n/2);
        int halfpowersq = halfpower * halfpower;
        // n is odd 
        if(n%2 != 0){
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        //System.out.println(power(x, n));
        System.out.println(optimisedpower(x, n));
    }
}
