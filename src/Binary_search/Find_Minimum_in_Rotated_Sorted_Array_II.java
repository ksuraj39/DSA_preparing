package Binary_search;

public class Find_Minimum_in_Rotated_Sorted_Array_II {
    public static int Minimum_in_Rotated_Sorted(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if(nums[mid]==nums[low]){
                low++;
            } else if (nums[mid]==nums[high]) {
                high--;
            }
            else if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[]arr = {3,3,1,3 };
        System.out.println(Minimum_in_Rotated_Sorted(arr));
    }
}
