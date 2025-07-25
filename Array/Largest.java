public class Largest {
    public static int largest(int array[]){
        int large = Integer.MIN_VALUE;//-infinty
        int small = Integer.MAX_VALUE;
        for(int i= 0;i<array.length;i++){
            if(array[i]>large){
                large = array[i];
            }
            if(small>array[i]){
                small = array[i];
            }
    }
    System.out.println("Smallest no is"+small );
    return large;
}
    public static void main(String []args){
        int array[]={1,2,5,7,8,2,3,4,5,6,0};
        System.out.println("largest no is "+largest(array));
        
    }
    
}
