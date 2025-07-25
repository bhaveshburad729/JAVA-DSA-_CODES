public class Array_reverse {
    public static void reverseArray(int array[]){
          int start = 0; int end = array.length-1;
          while(start<end){
            int temp =array[end];
            array[end]= array[start];
            array[start]= temp;
            start++;
            end--;
          }
    }
    public static void main (String[]args){
        int array[]={1,2,3,4,5,6,7,8,9};
        reverseArray(array);
        for(int i= 0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
