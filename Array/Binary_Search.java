public class Binary_Search {
    public static int Binary(int array[],int key){
        int start = 0;
        int end = array.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(array[mid]==key){
                return mid;

            } else if (array[mid]>key){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int array[]= { 1,2,4,6,9,23,56,78,90};
        int key = 1;
        Binary(array, key);
    }
    
}