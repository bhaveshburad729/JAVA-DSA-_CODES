package Assignment;

public class Que2 {
    public static int Roatate(int nums [] ,int key){
        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            int mid = (left + right )/2;
            if(nums[mid] == key){
                return mid;
            }
            //left sorted portion
            if(nums[left]<=nums[mid]){
                if(key>=nums[left]&&key<nums[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            //right sorted part 
            else{
                if(key>nums[mid]&& key<=nums[right]){
                    left = mid + 1;
                }else{
                    right = mid -1 ;
                }
            }

        }
        return -1; // key not found
    }    
    public static void main (String[]args){
        int nums[ ]= {4,6,7,0,1,2,3};
        int key = 0;
        System.out.println("Index of " + key + " is: " + Roatate(nums, key)); // Output: Index of 0 is: 3
    }
}
