package Binary_search;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static int Minimum_in_Rotated_Sorted(int[]nums){
        int low = 0;
        int high = nums.length-1;
        while(low < high){
            int mid = low +(high-low)/2;
            if(nums[mid]>nums[high]){
                low =mid+1;
            }else{
                high = mid;
            }
        }
        return nums[high];
    }
    public static void main(String[] args) {
        int [] arr = {3,4,5,6,7,1,2};
        System.out.println(Minimum_in_Rotated_Sorted(arr));
    }
}
