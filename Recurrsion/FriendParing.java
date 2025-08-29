public class FriendParing {
    public static int friendParings(int n){
        if(n ==1 || n == 2){
            return n;
        }
        //single
        int fnm1 = friendParings(n-1);
        //pair
        int fnm2 = friendParings(n-2);
        int pairWays = (n-1)*fnm2;
        int totalways  = fnm1 + pairWays;
        return totalways; 
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendParings(n));
    }
}
