public class linear_Search {

    public static int Linear_search(int numbers[], int key){
        for ( int i = 0 ;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
            
        }
        return-1;
    }
    public static void main ( String [] args){
        int numbers[] = {1,2,3,43,54,12,34,65,78};
        int key = 54;
        int index = Linear_search(numbers,key);
        if(index == -1){
            System.out.println("Key not found ");
        }
        else{
            System.out.println("key was found at index " + index);
        }

    }
    
}