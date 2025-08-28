public class FirstOccureence{
    public static int firstOcc(int arr [] , int key , int i){
        if(i == arr.length){
            return -1;
        }
        if ( arr[i] == key){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }
    public static void main (String[]args){
        int arr [] = {1,2,3,4,2,5};
        int key = 4;
        System.out.println("The index of key is = "+firstOcc(arr, key, 0));
    }
}