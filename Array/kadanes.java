public class kadanes {
    public static void Kadane(int array[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            cs = cs + array[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println(ms);
    }
    public static void main (String[]args){
        int array[] = {-2,-3,-1,4,-1,-2,1,5,-3};
        Kadane(array);
    }
}
