class Operators {
    public static int getIthbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0; // ith bit is 0
        } else {
            return 1; // ith bit is 1
        }
    }
    public static int setIthbit(int n , int i){
        int bitmask = 1<<i;
        return n|bitmask ; // set ith bit to 1
    }
    public static int clearIthBit(int n , int i ){
        int bitmask = 1<<i;
        return n&(~bitmask);
    }
    public static int updateIthBit(int n , int i,int newbit){
        if (newbit == 0){
           return clearIthBit(n ,i );
        }
        else{
           return setIthbit(n ,i);
        }
    }
    public static int clearLastIBits(int n , int i){
        int bitmask = (-1) << i; // -1 == (~0);
        return n & bitmask;
    }

    public static void main(String[] args) {
       // System.out.println(getIthbit(10, 2));
        //System.out.println(setIthbit(10, 2));
        //System.out.println(clearIthBit(10,1)); // clears the
        System.out.println(updateIthBit(10, 2, 0)); // updates the ith bit to newbit
    }
}